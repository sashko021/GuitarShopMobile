package com.example.guitarshopmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class LoginScreen extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    PagerAdapter pagerAdapter;



    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);

        setContentView(R.layout.login_screen_layout);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.pager);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),getLifecycle());

        pagerAdapter.addFragment(new LoginFragment());
        pagerAdapter.addFragment(new SignUpFragment());
        viewPager.setAdapter(pagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager, ((tab, position) -> {if (position==0){
        tab.setText("LOGIN");
        }
        else tab.setText("SIGN UP");
        })).attach();


    }

    public static class PagerAdapter extends FragmentStateAdapter {

        ArrayList<Fragment> fragmentList = new ArrayList<>();

        public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }


        @NonNull
        @Override
        public Fragment createFragment(int position) {

            return fragmentList.get(position);

        }
        public void addFragment(Fragment fragment){
            fragmentList.add(fragment);
        }

        @Override
        public int getItemCount() {
            return fragmentList.size();
        }
    }

}
