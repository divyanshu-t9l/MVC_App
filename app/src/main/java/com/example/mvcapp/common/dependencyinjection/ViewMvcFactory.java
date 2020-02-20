package com.example.mvcapp.common.dependencyinjection;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.mvcapp.screens.employeelist.MainActivityMvcViewImpl;
import com.example.mvcapp.screens.employeelist.MainActivityViewMvc;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public class ViewMvcFactory {

    private final LayoutInflater mLayoutInflater;

    public ViewMvcFactory(LayoutInflater mLayoutInflater) {
        this.mLayoutInflater = mLayoutInflater;
    }

    public MainActivityViewMvc getMainActivityViewMvc(@Nullable ViewGroup parent) {
        return new MainActivityMvcViewImpl(mLayoutInflater, parent);
    }
}
