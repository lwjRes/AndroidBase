package com.lwjfork.base.helper.fragment;

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

public interface IFragmentViewHelper extends IResourceHelper {


    @SuppressWarnings("unchecked")
    default <T extends View> T findViewByID(View parent, @IdRes int id) {
        return IViewHelper.findViewById(parent, id);
    }

    @LayoutRes
    int getRootLayoutId();
}
