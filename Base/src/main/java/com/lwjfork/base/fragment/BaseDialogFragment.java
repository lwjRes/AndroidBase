package com.lwjfork.base.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lwjfork.base.helper.fragment.IFragmentHelper;
import com.lwjfork.base.helper.fragment.IFragmentViewHelper;

/**
 * Created:2018/6/12
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */
public abstract class BaseDialogFragment extends DialogFragment implements IFragmentViewHelper, IFragmentHelper {

    @Override
    @SuppressWarnings("unchecked")
    public Activity getContextHelper() {
        return getActivity();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layoutId = getRootLayoutId();
        return LayoutInflater.from(getContext()).inflate(layoutId, null);
    }

}