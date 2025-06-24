package com.example.hw4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CountryPagerAdapter extends FragmentStateAdapter {

    public CountryPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new UKFragment();
            case 1:
                return new ItalyFragment();
            case 2:
                return new FranceFragment();
            default:
                return new UKFragment(); // Fallback
        }
    }

    @Override
    public int getItemCount() {
        return 3; // UK, Italy, France
    }
}
