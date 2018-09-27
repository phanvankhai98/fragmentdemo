package com.example.myducument.zingmp3;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myducument.zingmp3.adapter.MainViewPagerAdapter;
import com.example.myducument.zingmp3.frangment.Fragment_trang_chu;
import com.example.myducument.zingmp3.frangment.Frangment_tim_kiem;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayoutMenu;
    ViewPager viewPagerMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inIt();
        inItAdapter();
    }

    private void inItAdapter() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_trang_chu(), "Trang chu");
        mainViewPagerAdapter.addFragment(new Frangment_tim_kiem(), "Tim kiem");
        viewPagerMenu.setAdapter(mainViewPagerAdapter);
        tabLayoutMenu.setupWithViewPager(viewPagerMenu);
        tabLayoutMenu.getTabAt(0).setIcon(R.drawable.home);
        tabLayoutMenu.getTabAt(1).setIcon(R.drawable.iconsearch);
    }

    private void inIt() {
        tabLayoutMenu = findViewById(R.id.tablayout_menu);
        viewPagerMenu = findViewById(R.id.viewpager_menu);
    }
}
