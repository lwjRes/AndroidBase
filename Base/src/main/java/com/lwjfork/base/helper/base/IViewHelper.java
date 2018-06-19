package com.lwjfork.base.helper.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created:2018/6/12
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class IViewHelper {


    @SuppressWarnings("unchecked")
    public static <T extends View> T findViewById(Activity activity, @IdRes int id) {
        return (T) activity.findViewById(id);
    }

    @SuppressWarnings("unchecked")
    public static <T extends View> T findViewById(View parent, @IdRes int id) {
        return (T) parent.findViewById(id);
    }


    @SuppressWarnings("unchecked")
    public static <T extends View> T findViewById(Dialog parent, @IdRes int id) {
        return (T) parent.findViewById(id);
    }

    public static View inflate(Context context, int layoutId) {
        return inflate(context, layoutId, null, false);
    }

    public static View inflate(Context context, @LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot) {
        return newInflate(context).inflate(resource, root, attachToRoot);
    }

    public static View inflate(Context context, @LayoutRes int resource, @Nullable ViewGroup root) {
        return newInflate(context).inflate(resource, root, root != null);
    }

    public static LayoutInflater newInflate(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("This context  can't be NULL");
        }
        return LayoutInflater.from(context);
    }

}
