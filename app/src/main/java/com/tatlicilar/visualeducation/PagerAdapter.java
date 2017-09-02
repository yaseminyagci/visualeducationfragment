package com.tatlicilar.visualeducation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tatlicilar.visualeducation.frag1;
import com.tatlicilar.visualeducation.frag2;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                frag1 tab1 = new frag1();
                return tab1;
            case 1:
                frag2 tab2 = new frag2();
                return tab2;
            case 2:
                frag3 tab3 = new frag3();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
