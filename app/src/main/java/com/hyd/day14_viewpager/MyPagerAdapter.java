package com.hyd.day14_viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * created dpb on 16/6/2.
 * <p/>
 * e_mail  dengpbs@163.com.
 *
 *

 */
public class MyPagerAdapter extends PagerAdapter {

    private List<View> list;

    public MyPagerAdapter(List<View> list) {
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //Log.e("------","----->positon:"+position);
        View view = list.get(position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //Log.e("------","positon:"+position);
        container.removeView(list.get(position));
    }
}
