package com.example.mvcapp.common.dependencyinjection;

import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvcapp.networking.MyCustomAPI;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public class ControllerCompositionRoot {

    private final CompositionRoot mCompositionRoot;
    private final AppCompatActivity mActivity;

    public ControllerCompositionRoot(CompositionRoot mCompositionRoot, AppCompatActivity activity) {
        this.mCompositionRoot = mCompositionRoot;
        this.mActivity = activity;
    }

    public MyCustomAPI getMyCustomAPI() {
        return mCompositionRoot.getMyCustomAPI();
    }

    private LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(mActivity);
    }

    public ViewMvcFactory getViewMvcFactory() {
        return new ViewMvcFactory(getLayoutInflater());
    }
}
