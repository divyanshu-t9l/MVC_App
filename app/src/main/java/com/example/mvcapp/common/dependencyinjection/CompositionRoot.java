package com.example.mvcapp.common.dependencyinjection;

import com.example.mvcapp.networking.MyCustomAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.mvcapp.common.Constants.BASE_URL;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public class CompositionRoot {
    private Retrofit mRetrofit;

    private Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

    public MyCustomAPI getMyCustomAPI() {
        return getRetrofit().create(MyCustomAPI.class);
    }
}
