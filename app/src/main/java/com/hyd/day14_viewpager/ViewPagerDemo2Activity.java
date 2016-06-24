package com.hyd.day14_viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerDemo2Activity extends AppCompatActivity {


    private ViewPager viewPager;
    private List<View> list;
    private RadioGroup radioGroup;
    private RadioButton[] radioButtons;
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
        setContentView(R.layout.activity_view_pager_demo2);

        viewPager = (ViewPager) findViewById(R.id.id_ViewPager);
        radioGroup = (RadioGroup) findViewById(R.id.id_pager_radiogroup);

        // 数据源
        getData();
        // 适配器
        MyPagerAdapter adapter = new MyPagerAdapter(list);

        // 设置适配器
        viewPager.setAdapter(adapter);

        // 给RadioGroup添加一个监听器
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // 设置ViewPager显示哪个Pager页
                viewPager.setCurrentItem(checkedId);
            }
        });


        // 设置ViewPager的滑动监听器
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /**
             * 当pager页滚动时候回调
             * @param position
             * @param positionOffset
             * @param positionOffsetPixels
             */
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("-----","onPageScrolled"+position+" "+positionOffset+" "+positionOffsetPixels);
            }

            /**
             * 当Pager页被选中后的回调方法
             * @param position
             */
            @Override
            public void onPageSelected(int position) {
                Log.e("-----","onPageSelected"+position);
                // 当新的Pager被选中后我们需要改变RadioGroup中被选中的RadioButton
                // 把选中RadioButton变成红色，其他的变成黑色
                for (int i = 0 ; i < res.length ; i ++)
                {
                    if(i == position)
                    {
                        radioButtons[i].setTextColor(Color.RED);
                    }else
                    {
                        radioButtons[i].setTextColor(Color.BLACK);
                    }
                }
            }

            /**
             * pager页状态改变的回调方法
             * @param state
             */
            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e("-----","onPageScrollStateChanged:"+state);
            }
        });
    }

    public void getData()
    {
        list = new ArrayList<>();
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        radioButtons = new RadioButton[res.length];

        for (int i = 0 ; i < res.length ; i++)
        {
            View view = getLayoutInflater().inflate(R.layout.custom_viewpager_pager,null);
            // 设置图片
            ImageView iv = (ImageView) view.findViewById(R.id.id_pager_imageview);
            iv.setImageResource(res[i]);
            // 设置文本
            TextView tv = (TextView) view.findViewById(R.id.id_pager_tv);
            tv.setText("第" + (i + 1) + "个Pager页");
            list.add(view);

            View rbView = getLayoutInflater().inflate(R.layout.pager_radiobutton,null);
            RadioButton rb = (RadioButton) rbView.findViewById(R.id.id_radiobutton);
            rb.setId(i);
            radioButtons[i] = rb;
            radioGroup.addView(rb);
        }

        radioButtons[0].setTextColor(Color.RED);



    }
}
