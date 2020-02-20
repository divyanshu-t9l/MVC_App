package com.example.mvcapp.screens.common;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvcapp.MVCApplication;
import com.example.mvcapp.common.dependencyinjection.ControllerCompositionRoot;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public class BaseActivity extends AppCompatActivity {
    private ControllerCompositionRoot mControllerCompositionRoot;

    protected ControllerCompositionRoot getCompositonRoot() {
        if (mControllerCompositionRoot == null) {
            mControllerCompositionRoot = new ControllerCompositionRoot(((MVCApplication) getApplication()).getCompositionRoot(), this);
        }
        return mControllerCompositionRoot;
    }
}
