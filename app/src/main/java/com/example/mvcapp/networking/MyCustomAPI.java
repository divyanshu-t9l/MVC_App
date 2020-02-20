package com.example.mvcapp.networking;

import com.example.mvcapp.employees.EmployeeSchema;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public interface MyCustomAPI {
    @GET("employees")
    Call<EmployeeSchema> employeesList();

}
