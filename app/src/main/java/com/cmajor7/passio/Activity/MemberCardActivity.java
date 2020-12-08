package com.cmajor7.passio.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.cmajor7.passio.Adapter.RankFragmentAdapter;
import com.cmajor7.passio.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MemberCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_card);

        TabLayout tabLayout = findViewById(R.id.rank);
        TabItem silver = findViewById(R.id.silver);
        TabItem gold = findViewById(R.id.gold);
        TabItem plat = findViewById(R.id.plat);
        ViewPager viewPager = findViewById(R.id.vp_rank);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_notification_detail);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thẻ thành viên");

        RankFragmentAdapter rankFragmentAdapter = new RankFragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(rankFragmentAdapter);

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