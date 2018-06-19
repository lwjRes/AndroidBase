package com.lwjfork.base.helper.activity;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
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

public interface IActivityViewHelper extends IResourceHelper {


    @SuppressWarnings("unchecked")
    default <T extends View> T findViewByID(@IdRes int id) {
        return IViewHelper.findViewById(getContextHelper(), id);
    }

    @Override
    @SuppressWarnings("unchecked")
    Activity getContextHelper();


    @LayoutRes
    int getRootLayoutId();

    void initView();
}
