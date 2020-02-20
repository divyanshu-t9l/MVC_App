package com.example.mvcapp.screens.common;

import android.content.Context;
import android.view.View;

/**
 * Created by Divyanshu  on 20/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public abstract class BaseViewMvc implements ViewMvc {

    private View mRootView;

    @Override
    public View getRootView() {
        return mRootView;
    }

    protected void setRootView(View rootView) {
        mRootView = rootView;
    }

    protected <T extends View> T findViewById(int id) {
        return mRootView.findViewById(id);
    }

    protected Context getContext() {
        return mRootView.getContext();
    }
}
