package com.lwjfork.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lwjfork.base.helper.activity.IActivityViewHelper;

public class MainActivity extends AppCompatActivity implements IActivityViewHelper {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_test = findViewByID(R.id.tv_test);
        tv_test.setOnClickListener((view) -> {
            tv_test.setText("tv_test");
        });
    }

    @Override
    public Activity getContextHelper() {
        return this;
    }


}
