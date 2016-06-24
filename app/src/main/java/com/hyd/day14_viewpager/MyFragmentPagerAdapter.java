package com.hyd.day14_viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * created dpb on 16/6/3.
 * <p/>
 * e_mail  dengpbs@163.com.
 *
 * 当pager页不太多的时候选择FragmentPagerAdapter
 * 当pager页非常多的时候选择FragmentStatePagerAdapter
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;

    private FragmentManager fm;

    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        Log.e("-----","getItem:"+position+" "+fm.getFragments());
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }


}
