package com.lwjfork.base.helper.base;

import android.os.Bundle;

/**
 * Created:2018/6/13
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IBundleHelper {


    @SuppressWarnings("unchecked")
    default byte getByte(String key) {
        return getByte(key, (byte) 0);
    }

    default byte getByte(String key, byte defaultValue) {
        Bundle bundle = getBundle();
        if (bundle == null) {
            return defaultValue;
        }
        return bundle.getByte(key, defaultValue);
    }

    @SuppressWarnings("unchecked")
    default byte[] getByteArray(String key) {
        Bundle bundle = getBundle();
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray(key);
    }


    @SuppressWarnings("unchecked")
    default boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    default boolean getBoolean(String key, boolean defaultValue) {
        Bundle bundle = getBundle();
        if (bundle == null) {
            return defaultValue;
        }
        return bundle.getBoolean(key, defaultValue);
    }

    @SuppressWarnings("unchecked")
    default boolean[] getBooleanArray(String key) {
        Bundle bundle = getBundle();
        if (bundle == null) {
            return null;
        }
        return bundle.getBooleanArray(key);
    }


    @SuppressWarnings("unchecked")
    default char getChar(String key) {
        return getChar(key, (char) 0);
    }

    default char getChar(String key, char defaultValue) {
        Bundle bundle = getBundle();
        if (bundle == null) {
            return defaultValue;
        }
        return bundle.getChar(key, defaultValue);
    }

    @SuppressWarnings("unchecked")
    default char[] getCharArray(String key) {
        Bundle bundle = getBundle();
        if (bundle == null) {
            return null;
        }
        return bundle.getCharArray(key);
    }







    default Bundle getBundle() {
        throw new AbstractMethodError("this method for getBundle isInvalid,you must implements it");
    }


}
