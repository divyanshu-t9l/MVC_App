package com.example.mvcapp.screens.common;

/**
 * Created by Divyanshu  on 20/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public interface ObservableViewMvc<ListenerType> extends ViewMvc {

    void register(ListenerType listener);

    void unregister(ListenerType listener);
}
