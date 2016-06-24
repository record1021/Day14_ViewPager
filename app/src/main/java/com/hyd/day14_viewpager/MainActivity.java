package com.hyd.day14_viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void jumpViewPageDemo1(View view)
    {
        Intent intent = new Intent(this,ViewPagerDemo1Activity.class);
        startActivity(intent);
    }

    public void jumpViewPageDemo2(View view)
    {
        Intent intent = new Intent(this,ViewPagerDemo2Activity.class);
        startActivity(intent);
    }

    public void jumpViewPageDemo3(View view)
    {
        Intent intent = new Intent(this,ViewPagerDemo3Activity.class);
        startActivity(intent);
    }

    public void jumpViewPageDemo4(View view)
    {
        Intent intent = new Intent(this,ViewPagerDemo4Activity.class);
        startActivity(intent);
    }
}
