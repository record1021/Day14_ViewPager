package com.hyd.day14_viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.hyd.day14_viewpager.fragment.FragmentDemo1;
import com.hyd.day14_viewpager.fragment.FragmentDemo2;
import com.hyd.day14_viewpager.fragment.FragmentDemo3;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerDemo3Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> list;
    private Fragment[] fragments = {
            new FragmentDemo1()
            ,new FragmentDemo2()
            ,new FragmentDemo3()
            ,new FragmentDemo1()
            ,new FragmentDemo2()
            ,new FragmentDemo3()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_demo3);
        viewPager = (ViewPager) findViewById(R.id.id_3_viewPager);

        // 数据源
        getData();
        // 选择适配器
       // MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),list);

        MyFragmentStatePagerAdapter adapter = new MyFragmentStatePagerAdapter(getSupportFragmentManager(),list);
        // 设置适配器
        viewPager.setAdapter(adapter);
    }

    public void getData() {
        list = new ArrayList<>();
        for ( int i = 0; i < fragments.length ; i ++)
        {
            list.add(fragments[i]);
        }
    }
}
