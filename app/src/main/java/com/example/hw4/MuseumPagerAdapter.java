package com.example.hw4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.hw4.Museum1Fragment;
import com.example.hw4.Museum2Fragment;
import com.example.hw4.Museum3Fragment;

public class MuseumPagerAdapter extends FragmentStateAdapter {

    public MuseumPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new Museum1Fragment();
            case 1: return new Museum2Fragment();
            case 2: return new Museum3Fragment();
            default: return new Museum1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
