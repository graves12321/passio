package com.cmajor7.passio.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.cmajor7.passio.Adapter.CouponFragmentAdapter;
import com.cmajor7.passio.Adapter.OrderFragmentAdapter;
import com.cmajor7.passio.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        TabLayout tabLayout = findViewById(R.id.order);
        TabItem ice = findViewById(R.id.ice);
        TabItem soda = findViewById(R.id.soda);
        TabItem passio = findViewById(R.id.passio);
        ViewPager viewPager = findViewById(R.id.vp_order);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Chọn món");

        OrderFragmentAdapter orderFragmentAdapter = new OrderFragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(orderFragmentAdapter);

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