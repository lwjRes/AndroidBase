package com.lwjfork.test;

import android.content.Context;
import android.os.Bundle;

import com.lwjfork.base.activity.BaseAppCompatActivity;
import com.lwjfork.base.helper.base.IBundleHelper;

/**
 * Created:2018/6/13
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class BundleActivity extends BaseAppCompatActivity implements IBundleHelper {


    public static void launch(Context context) {




    }


    @Override
    public int getRootLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void initBundle(Bundle bundle) {
        super.initBundle(bundle);
        String text = bundle.getString("text");
        int test = bundle.getInt("test1");

        System.out.println(text);
        System.out.println(test);

    }
}
