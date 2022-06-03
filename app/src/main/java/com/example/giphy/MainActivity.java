package com.example.giphy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.giphy.adapters.GiphyPagerAdapter;
import com.example.giphy.fragments.RandomGif;
import com.example.giphy.fragments.SearchFragment;
import com.example.giphy.fragments.TrendingFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tabLayout.setupWithViewPager(viewPager);

        List<Fragment> fragments = new ArrayList<>();
        List<String> titles = new ArrayList<>();
        fragments.add(SearchFragment.newInstance());
        titles.add("Search");
        fragments.add(TrendingFragment.newInstance("",""));
        titles.add("Trending");
        fragments.add(RandomGif.newInstance("",""));
        titles.add("Random");

        viewPager.setAdapter(new GiphyPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,fragments,titles));


    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}