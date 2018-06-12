package com.lwjfork.base.helper.base;

import android.support.annotation.IdRes;
import android.view.View;

/**
 * Created:2018/6/12
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IViewHelper {


    <T extends View> T findViewByID(@IdRes int id);

    @SuppressWarnings("unchecked")
    default <T extends View> T findViewByID(View parent, @IdRes int id) {
        return (T) parent.findViewById(id);
    }


}
