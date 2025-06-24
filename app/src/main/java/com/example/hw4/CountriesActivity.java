package com.example.hw4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity; // ✅ This must be correct
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity { // ✅ Not Fragment or anything else

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabCountries);

        com.example.hw4.CountryPagerAdapter adapter = new com.example.hw4.CountryPagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("UK");
                    break;
                case 1:
                    tab.setText("Italy");
                    break;
                case 2:
                    tab.setText("France");
                    break;
            }
        }).attach();
    }
}
