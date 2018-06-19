package com.lwjfork.test;

import android.os.Bundle;
import android.widget.TextView;

import com.lwjfork.base.activity.BaseAppCompatActivity;

public class MainActivity extends BaseAppCompatActivity {


    @Override
    public void initView() {
        TextView tv_test = findViewByID(R.id.tv_test);
        tv_test.setOnClickListener((view) -> {
            Bundle bundle = new Bundle();
            bundle.putString("text", "text1222");
            bundle.putInt("test1", 40);
            startActivity(BundleActivity.class, bundle);
            tv_test.setText(getStringById(R.string.test));
        });
        tv_test.setBackgroundColor(getColorById(R.color.colorAccent));
    }

    @Override
    public int getRootLayoutId() {
        return R.layout.activity_main;
    }
}

