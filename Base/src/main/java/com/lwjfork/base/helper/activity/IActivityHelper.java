package com.lwjfork.base.helper.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.lwjfork.base.helper.base.IResourceHelper;
import com.lwjfork.base.helper.base.IViewHelper;

/**
 * Created:2018/6/12
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IActivityHelper extends IResourceHelper {


    default <T extends Activity> void startActivity(Class<T> clazz) {
        startActivity(clazz, null);
    }

    default <T extends Activity> void startActivity(Class<T> clazz, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(getContextHelper(), clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        ContextCompat.startActivity(getContextHelper(), intent, bundle);
    }


    @SuppressWarnings("unchecked")
    default <T extends View> T findViewByID(@IdRes int id) {
        return IViewHelper.findViewById(getContextHelper(), id);
    }

    default void initIntent() {
        Activity activity = getContextHelper();
        Intent intent = activity.getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                initBundle(bundle);
            }
        }
    }


    @Override
    @SuppressWarnings("unchecked")
    Activity getContextHelper();


    @LayoutRes
    int getRootLayoutId();

    void initView();


    default void initBundle(Bundle bundle) {

    }

}
