package com.example.hw4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.example.hw4.WondersPagerAdapter;

public class WondersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        ViewPager2 viewPager = findViewById(R.id.viewPagerWonders);
        TabLayout tabLayout = findViewById(R.id.tabWonders);

        WondersPagerAdapter adapter = new WondersPagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Great Wall");
                    break;
                case 1:
                    tab.setText("Petra");
                    break;
                case 2:
                    tab.setText("Christ the Redeemer");
                    break;
            }
        }).attach();
    }
}