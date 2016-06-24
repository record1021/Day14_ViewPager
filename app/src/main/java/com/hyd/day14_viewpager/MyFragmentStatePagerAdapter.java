package com.hyd.day14_viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * created dpb on 16/6/3.
 * <p/>
 * e_mail  dengpbs@163.com.
 */
public class MyFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> list;

    private FragmentManager fm;

    public MyFragmentStatePagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        Log.e("-----", "getItem:" + position + " " + fm.getFragments());
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
