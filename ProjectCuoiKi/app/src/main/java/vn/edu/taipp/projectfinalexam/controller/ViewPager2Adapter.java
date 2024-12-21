package vn.edu.taipp.projectfinalexam.controller;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager2Adapter extends FragmentStateAdapter {

    public ViewPager2Adapter(@NonNull Fragment fragment) {
        super(fragment);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentBaiViet(); // Tab 1
            case 1:
                return new FragmentDanhMuc(); // Tab 2
            default:
                throw new IllegalStateException("Invalid tab position");
        }
    }

    @Override
    public int getItemCount() {
        return 2; // Số lượng tab
    }
}
