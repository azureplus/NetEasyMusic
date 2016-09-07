package com.chh.music.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by chenhao on 16/5/15.
 */
public class TabPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> mTabFragmentList;
    private List<String> mTabTitleList;
    public TabPageAdapter(FragmentManager fm, List<Fragment> tabFragments, List<String> tabTitles) {
        super(fm);
        mTabFragmentList = tabFragments;
        mTabTitleList = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return mTabFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mTabTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitleList.get(position % mTabTitleList.size());
    }
}
