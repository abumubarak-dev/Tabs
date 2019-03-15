package com.example.user.app;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomPagerAdapter customPagerAdapter= new CustomPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager=findViewById(R.id.viewpager);

        TabLayout tabLayout=findViewById(R.id.tab);

        customPagerAdapter.addFragment(new Fragment_Home(),"Home");

        customPagerAdapter.addFragment(new Fragment_Chat(),"Chat");

        customPagerAdapter.addFragment(new Fragment_Call(),"Call");

        viewPager.setAdapter(customPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}
