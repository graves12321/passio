package com.cmajor7.passio.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cmajor7.passio.Fragment.DatedFragment;
import com.cmajor7.passio.Fragment.NvUseFragment;
import com.cmajor7.passio.Fragment.UsedFragment;

public class CouponFragmentAdapter extends FragmentPagerAdapter {
    private int numOfRank;
    public CouponFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public CouponFragmentAdapter(@NonNull FragmentManager fm, int numOfRank) {
        super(fm);
        this.numOfRank = numOfRank;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NvUseFragment();
            case 1:
                return new UsedFragment();
            case 2:
                return new DatedFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfRank;
    }
}
