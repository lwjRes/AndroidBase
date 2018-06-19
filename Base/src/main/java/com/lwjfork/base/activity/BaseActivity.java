package com.lwjfork.base.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lwjfork.base.helper.activity.IActivityHelper;
import com.lwjfork.base.helper.activity.IActivityViewHelper;

/**
 * Created:2018/6/12
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public abstract class BaseActivity extends Activity implements  IActivityHelper {

    @Override
    public Activity getContextHelper() {
        return this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getRootLayoutId());
        initIntent();
        initView();
    }

    @Override
    public void initView() {

    }

    @Override
    public void initBundle(Bundle bundle) {

    }

}
