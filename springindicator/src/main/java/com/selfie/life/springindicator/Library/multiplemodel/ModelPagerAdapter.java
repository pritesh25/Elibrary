package com.selfie.life.springindicator.Library.multiplemodel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

//import github.chenupt.multiplemodel.viewpager.PagerModelManager;

public class ModelPagerAdapter extends FragmentStatePagerAdapter {
    protected PagerModelManager pagerModelManager;

    public ModelPagerAdapter(FragmentManager fm, PagerModelManager pagerModelManager) {
        super(fm);
        this.pagerModelManager = pagerModelManager;
    }

    public Fragment getItem(int position) {
        return this.pagerModelManager.getItem(position);
    }

    public int getCount() {
        return this.pagerModelManager.getFragmentCount();
    }

    public CharSequence getPageTitle(int position) {
        return this.pagerModelManager.hasTitles() ? this.pagerModelManager.getTitle(position) : super.getPageTitle(position);
    }
}