package com.hyd.day14_viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerDemo4Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    // Tab页中的标题信息
    private List<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_demo4);
        viewPager = (ViewPager) findViewById(R.id.id_4_viewpager);
        tabLayout = (TabLayout) findViewById(R.id.id_tablayout);

        titles = new ArrayList<>();
        titles.add("头条");
        titles.add("国际");
        titles.add("国内");
        titles.add("娱乐");
        titles.add("体育");
        titles.add("经济");

        // 选择适配器
        MyTabFragmentStatePagerAdapter adapter = new MyTabFragmentStatePagerAdapter(getSupportFragmentManager(),titles);
        viewPager.setAdapter(adapter);
        // TabLayout和ViewPager关联
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.argb(255, 0, 0, 0), Color.argb(255, 255, 0, 0));
        tabLayout.setSelectedTabIndicatorColor(Color.GREEN);



    }
}
