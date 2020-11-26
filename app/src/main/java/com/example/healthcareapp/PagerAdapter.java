package com.example.healthcareapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PagerAdapter(FragmentManager fm,int numOfTabs){
        super(fm);
        this.numOfTabs=numOfTabs;
    }
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FragmentLoginEmployee();
            case 1:
                return new FragmentLoginHR();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
