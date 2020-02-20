package com.example.mvcapp.screens.common;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Divyanshu  on 20/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public abstract class BaseObservableViewMvc<ListenerType> extends BaseViewMvc
        implements ObservableViewMvc<ListenerType> {

    private Set<ListenerType> mListeners = new HashSet<>();

    @Override
    public void register(ListenerType listener) {
        mListeners.add(listener);
    }

    @Override
    public void unregister(ListenerType listener) {
        mListeners.remove(listener);
    }

    protected Set<ListenerType> getListeners() {
        return Collections.unmodifiableSet(mListeners);
    }
}
