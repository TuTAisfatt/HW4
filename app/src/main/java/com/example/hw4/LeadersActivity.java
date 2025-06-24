package com.example.hw4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.hw4.LeaderPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LeadersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);

        ViewPager2 viewPager = findViewById(R.id.viewPagerLeader);
        TabLayout tabLayout = findViewById(R.id.tabLeaders);

        LeaderPagerAdapter adapter = new LeaderPagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Leader 1");
                    break;
                case 1:
                    tab.setText("Leader 2");
                    break;
                case 2:
                    tab.setText("Leader 3");
                    break;
            }
        }).attach();
    }
}
