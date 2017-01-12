package com.bipra.pocketcare.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.bipra.pocketcare.R;
import com.bipra.pocketcare.adapter.ViewPagerAdapter;
import com.bipra.pocketcare.fragment.SummaryFragment;
import com.bipra.pocketcare.fragment.TransactionFragment;

public class DashboardActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initialize();
    }

    private void initialize() {
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        setUpViewPager();
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setUpViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TransactionFragment(),"Transaction");
        adapter.addFragment(new SummaryFragment(),"Summary");
        viewPager.setAdapter(adapter);

    }
}
