package com.lwjfork.base.helper.base;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.AnyRes;
import android.support.annotation.ArrayRes;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;

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

        return ContextCompat.getColor(getContextHelper(), id);

    }


    @Nullable
    default Drawable getDrawableById(@DrawableRes int id) {
        return ContextCompat.getDrawable(getContextHelper(), id);
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
        return ContextCompat.getColorStateList(getContextHelper(), id);
    }

    @NonNull
    default CharSequence getTextById(@StringRes int id) {
        return getContextHelper().getResources().getText(id);
    }

    default String getResourceEntryNameById(@AnyRes int id) {
        return getContextHelper().getResources().getResourceEntryName(id);
    }


    <T extends Context> T getContextHelper();



    @ColorInt
    static int getColorById(Context context,@ColorRes int id) throws Resources.NotFoundException {

        return ContextCompat.getColor(context, id);

    }


    @Nullable
    static Drawable getDrawableById(Context context,@DrawableRes int id) {
        return ContextCompat.getDrawable(context, id);
    }


    @NonNull
    static String[] getStringArrayById(Context context,@ArrayRes int strArrayRes) {
        return context.getResources().getStringArray(strArrayRes);
    }

    @NonNull
    static int[] getIntArrayById(Context context,@ArrayRes int intArrayRes) {
        return context.getResources().getIntArray(intArrayRes);
    }

    @NonNull
    static CharSequence[] getTextArrayById(Context context,@ArrayRes int id) {
        return context.getResources().getTextArray(id);
    }

    @NonNull
    static String getStringById(Context context,@StringRes int id, Object... args) {
        return context.getString(id, args);
    }

    @Nullable
    static ColorStateList getColorStateListById(Context context,@ColorRes int id) {
        return ContextCompat.getColorStateList(context, id);
    }

    @NonNull
    static CharSequence getTextById(Context context,@StringRes int id) {
        return context.getResources().getText(id);
    }

    static String getResourceEntryNameById(Context context,@AnyRes int id) {
        return context.getResources().getResourceEntryName(id);
    }





}
