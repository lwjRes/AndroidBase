package com.lwjfork.base.helper.base;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.AnyRes;
import android.support.annotation.ArrayRes;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;

/**
 * Created:2018/6/12
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IResourceHelper {


    @ColorInt
    default int getColorById(@ColorRes int id) throws Resources.NotFoundException {

        if (Build.VERSION.SDK_INT >= 23) {
            return getContextHelper().getColor(id);
        } else {
            return getContextHelper().getResources().getColor(id);
        }
    }


    @Nullable
    default Drawable getDrawableById(@DrawableRes int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getContextHelper().getDrawable(id);
        } else {
            return getContextHelper().getResources().getDrawable(id);
        }
    }


    @NonNull
    default String getStringById(@StringRes int id) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            return context.getString(id);
//        } else {
//            return context.getResources().getString(id);
//        }
        return getContextHelper().getString(id);
    }

    @NonNull
    default String[] getStringArrayById(@ArrayRes int strArrayRes) {
        return getContextHelper().getResources().getStringArray(strArrayRes);
    }

    @NonNull
    default int[] getIntArrayById(@ArrayRes int intArrayRes) {
        return getContextHelper().getResources().getIntArray(intArrayRes);
    }

    @NonNull
    default CharSequence[] getTextArrayById(@ArrayRes int id) {
        return getContextHelper().getResources().getTextArray(id);
    }

    @NonNull
    default String getStringById(@StringRes int id, Object... args) {
        return getContextHelper().getString(id, args);
    }

    @Nullable
    default ColorStateList getColorStateListById(@ColorRes int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getContextHelper().getColorStateList(id);
        } else {
            return getContextHelper().getResources().getColorStateList(id);
        }
    }

    @NonNull
    default CharSequence getTextById(@StringRes int id) {
        return getContextHelper().getResources().getText(id);
    }

    default String getResourceEntryNameById(@AnyRes int id) {
        return getContextHelper().getResources().getResourceEntryName(id);
    }


    <T extends Context> T getContextHelper();
}
