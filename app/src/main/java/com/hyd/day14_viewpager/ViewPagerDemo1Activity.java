package com.hyd.day14_viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * ViewPager的简单使用
 */
public class ViewPagerDemo1Activity extends AppCompatActivity {

    private ViewPager viewPager;

    private List<View> list;



    private int[] res = {
            R.drawable.bj1
            ,R.drawable.bj2
            ,R.drawable.bj3
            ,R.drawable.bj4
            ,R.drawable.bj5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_demo1);

        viewPager = (ViewPager) findViewById(R.id.id_ViewPager);

        // 获取数据源
        getData();
        // 选择适配器
        MyPagerAdapter adapter = new MyPagerAdapter(list);
        // 设置适配器
        viewPager.setAdapter(adapter);

    }

    /**
     * 获取数据源
     */
    private void getData() {
        list = new ArrayList<>();
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        for (int i = 0 ; i < res.length ; i ++)
        {
            ImageView iv = new ImageView(this);
            iv.setImageResource(res[i]);
            iv.setLayoutParams(lp);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            // 添加到List中
            list.add(iv);

        }

    }
}
