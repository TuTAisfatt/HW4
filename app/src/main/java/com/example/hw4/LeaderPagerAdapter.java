package com.example.hw4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.hw4.DonaldTrumpFragment;
import com.example.hw4.PutinFragment;
import com.example.hw4.XiFragment;

public class LeaderPagerAdapter extends FragmentStateAdapter {

    public LeaderPagerAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new DonaldTrumpFragment();
            case 1: return new PutinFragment();
            case 2: return new XiFragment();
            default: return new DonaldTrumpFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
