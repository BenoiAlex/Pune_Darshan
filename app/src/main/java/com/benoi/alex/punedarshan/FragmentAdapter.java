package com.benoi.alex.punedarshan;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Cafes();
        } else if (position == 1) {
            return new Colleges();
        } else if (position == 2) {
            return new Companies();
        } else {
            return new Forts();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.cafe_tab);
        } else if (position == 1) {
            return context.getString(R.string.colleges_tab);
        } else if (position == 2) {
            return context.getString(R.string.companies_tab);
        } else {
            return context.getString(R.string.forts_tab);
        }
    }
}