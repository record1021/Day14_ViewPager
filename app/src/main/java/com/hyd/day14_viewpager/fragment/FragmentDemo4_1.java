package com.hyd.day14_viewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hyd.day14_viewpager.R;

/**
 * created dpb on 16/6/3.
 * <p/>
 * e_mail  dengpbs@163.com.
 */
public class FragmentDemo4_1 extends Fragment{
    private TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4_1,container,false);
        tv = (TextView) view.findViewById(R.id.id_4_tv);
        Bundle b = getArguments();
        if(b != null && b.containsKey("data")){
            tv.setText(b.getString("data"));
        }
        return view;
    }
}
