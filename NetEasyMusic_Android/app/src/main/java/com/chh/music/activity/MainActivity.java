package com.chh.music.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;


import com.chh.music.R;
import com.chh.music.adapter.TabPageAdapter;
import com.chh.music.fragment.DjradioFragment;
import com.chh.music.fragment.PlayListFragment;
import com.chh.music.fragment.TopListFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout mTabLayout;
    private TabPageAdapter mTabPageAdapter;
    private ViewPager mViewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        initTab();
    }


    private void initTab() {
        mTabLayout  = (TabLayout) findViewById(R.id.tab_layout);
        mViewPage = (ViewPager) findViewById(R.id.viewpager);
        String[] tabTitles = getResources().getStringArray(R.array.tabs);
        List<Fragment> tabFragments = new ArrayList<Fragment>();
        for(int i = 0;i < tabTitles.length;i ++){
            String title = tabTitles[i];
            Fragment frament = null;
            if(i == 0){
                frament = PlayListFragment.newInstance(title);
            }else if(i == 1){
                frament = DjradioFragment.newInstance(title);
            }else if(i == 2){
                frament = TopListFragment.newInstance(title);
            }
            tabFragments.add(frament);
            mTabLayout.addTab(mTabLayout.newTab().setText(title));
        }
        mTabPageAdapter = new TabPageAdapter(getSupportFragmentManager(), tabFragments, Arrays.asList(tabTitles));
        mViewPage.setAdapter(mTabPageAdapter);
        mTabLayout.setupWithViewPager(mViewPage);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
