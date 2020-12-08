package com.cmajor7.passio.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.cmajor7.passio.Adapter.CouponFragmentAdapter;
import com.cmajor7.passio.Adapter.RankFragmentAdapter;
import com.cmajor7.passio.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MyCouponActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_coupon);
        TabLayout tabLayout = findViewById(R.id.coupon);
        TabItem nvuse = findViewById(R.id.nvuse);
        TabItem used = findViewById(R.id.used);
        TabItem dated = findViewById(R.id.dated);
        ViewPager viewPager = findViewById(R.id.vp_coupon);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Coupon của tôi");

        CouponFragmentAdapter couponFragmentAdapter = new CouponFragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(couponFragmentAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // nút back
                onBackPressed();
                return true;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}