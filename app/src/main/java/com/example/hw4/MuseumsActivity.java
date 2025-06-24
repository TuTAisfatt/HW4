package com.example.hw4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.example.hw4.MuseumPagerAdapter;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        ViewPager2 viewPager = findViewById(R.id.viewPagerMuseums);
        TabLayout tabLayout = findViewById(R.id.tabMuseums);

        MuseumPagerAdapter adapter = new MuseumPagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0: tab.setText("Louvre"); break;
                case 1: tab.setText("British Museum"); break;
                case 2: tab.setText("Metropolitan"); break;
            }
        }).attach();
    }
}
