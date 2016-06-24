package com.hyd.day14_viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.hyd.day14_viewpager.fragment.FragmentDemo4_1;

import java.util.List;

/**
 * created dpb on 16/6/3.
 * <p/>
 * e_mail  dengpbs@163.com.
 */
public class MyTabFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    private List<String> list;

    public MyTabFragmentStatePagerAdapter(FragmentManager fm,List<String> list) {
        super(fm);
        this.list = list;
    }

    /**
     * 获取对应的Pager中的Fragment
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new FragmentDemo4_1();
        Bundle b = new Bundle();
        b.putString("data",""+list.get(position));
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    /**
     * ViewPager 和 Tab页中标题绑定
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
