package com.cmajor7.passio.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cmajor7.passio.Fragment.OrderAFragment;
import com.cmajor7.passio.Fragment.OrderBFragment;
import com.cmajor7.passio.Fragment.OrderCFragment;

public class OrderFragmentAdapter extends FragmentPagerAdapter {
    private int numOfRank;
    public OrderFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public OrderFragmentAdapter(@NonNull FragmentManager fm, int numOfRank) {
        super(fm);
        this.numOfRank = numOfRank;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OrderAFragment();
            case 1:
                return new OrderBFragment();
            case 2:
                return new OrderCFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfRank;
    }
}
