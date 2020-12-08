package com.cmajor7.passio.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cmajor7.passio.Fragment.GoldFragment;
import com.cmajor7.passio.Fragment.PlatinumFragment;
import com.cmajor7.passio.Fragment.SilverFragment;

public class RankFragmentAdapter extends FragmentPagerAdapter {
    private int numOfRank;
    public RankFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public RankFragmentAdapter(@NonNull FragmentManager fm, int numOfRank) {
        super(fm);
        this.numOfRank = numOfRank;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SilverFragment();
            case 1:
                return new GoldFragment();
            case 2:
                return new PlatinumFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfRank;
    }
}
