package com.chh.music.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

import static android.Manifest.permission.ACCESS_NETWORK_STATE;
import static android.Manifest.permission.INTERNET;

public class DeviceUtils {

    private DeviceUtils() {}

    public static enum ForceOrientation {
        FORCE_PORTRAIT("portrait"),
        FORCE_LANDSCAPE("landscape"),
        DEVICE_ORIENTATION("device"),
        UNDEFINED("");

        @NonNull
        private final String mKey;

        private ForceOrientation(@NonNull final String key) {
            mKey = key;
        }

        @NonNull
        public static ForceOrientation getForceOrientation(@Nullable String key) {
            for (final ForceOrientation orientation : ForceOrientation.values()) {
                if (orientation.mKey.equalsIgnoreCase(key)) {
                    return orientation;
                }
            }

            return UNDEFINED;
        }
    }


    public static boolean isNetworkAvailable(@Nullable final Context context) {
        if (context == null) {
            return false;
        }

        final int internetPermission = context.checkCallingOrSelfPermission(INTERNET);
        if (internetPermission == PackageManager.PERMISSION_DENIED) {
            return false;
        }

        /**
         * This is only checking if we have permission to access the network state
         * It's possible to not have permission to check network state but still be able
         * to access the network itself.
         */
        final int networkAccessPermission = context.checkCallingOrSelfPermission(ACCESS_NETWORK_STATE);
        if (networkAccessPermission == PackageManager.PERMISSION_DENIED) {
            return true;
        }

        // Otherwise, perform the connectivity check.
        try {
            final ConnectivityManager connnectionManager =
                    (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            final NetworkInfo networkInfo = connnectionManager.getActiveNetworkInfo();
            return networkInfo.isConnected();
        } catch (NullPointerException e) {
            return false;
        }
    }


    public static int getScreenOrientation(@NonNull final Activity activity) {
        final int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        final int deviceOrientation = activity.getResources().getConfiguration().orientation;

        return getScreenOrientationFromRotationAndOrientation(rotation, deviceOrientation);
    }

    static int getScreenOrientationFromRotationAndOrientation(int rotation, int orientation) {
        if (Configuration.ORIENTATION_PORTRAIT == orientation) {
            switch (rotation) {
                case Surface.ROTATION_90:
                case Surface.ROTATION_180:
                    return ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT;

                case Surface.ROTATION_0:
                case Surface.ROTATION_270:
                default:
                    return ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
            }
        } else if (Configuration.ORIENTATION_LANDSCAPE == orientation) {
            switch (rotation) {
                case Surface.ROTATION_180:
                case Surface.ROTATION_270:
                    return ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;

                case Surface.ROTATION_0:
                case Surface.ROTATION_90:
                default:
                    return ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
            }
        } else {
            CHHLog.d("Unknown screen orientation. Defaulting to portrait.");
            return ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
        }
    }


    /**
     * This tries to get the physical number of pixels on the device. This attempts to include
     * the pixels in the notification bar and soft buttons.
     *
     * @param context Needs a context (application is fine) to determine width/height.
     * @return Width and height of the device
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static Point getDeviceDimensions(@NonNull final Context context) {
        Integer bestWidthPixels = null;
        Integer bestHeightPixels = null;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            final WindowManager windowManager = (WindowManager) context.getSystemService(
                    Context.WINDOW_SERVICE);
            final Display display = windowManager.getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                final Point screenSize = new Point();
                display.getRealSize(screenSize);
                bestWidthPixels = screenSize.x;
                bestHeightPixels = screenSize.y;
            } else {
                try {
                    bestWidthPixels = (Integer) new Reflection.MethodBuilder(display,
                            "getRawWidth").execute();
                    bestHeightPixels = (Integer) new Reflection.MethodBuilder(display,
                            "getRawHeight").execute();
                } catch (Exception e) {
                    // Best effort. If this fails, just get the height and width normally,
                    // which may not capture the pixels used in the notification bar.
                    CHHLog.v("Display#getRawWidth/Height failed.", e);
                }
            }
        }

        if (bestWidthPixels == null || bestHeightPixels == null) {
            final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            bestWidthPixels = displayMetrics.widthPixels;
            bestHeightPixels = displayMetrics.heightPixels;
        }

        return new Point(bestWidthPixels, bestHeightPixels);
    }
}
