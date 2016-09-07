package com.chh.music;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by chenhao on 16/9/8.
 */
public class MusicApplication extends Application {

    private static RequestQueue queue;
    public static MusicApplication sInstance;


    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        queue = Volley.newRequestQueue(getApplicationContext());
    }

    public RequestQueue getHttpQueue() {
        return queue;
    }

    public static MusicApplication getInstance() {
        return sInstance;
    }
}
