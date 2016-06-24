package com.hyd.day14_viewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyd.day14_viewpager.R;

/**
 * created dpb on 16/6/3.
 * <p/>
 * e_mail  dengpbs@163.com.
 */
public class FragmentDemo3 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3,container,false);
        return view;
    }
}
