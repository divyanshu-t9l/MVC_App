package com.example.mvcapp.screens.employeelist;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.mvcapp.R;
import com.example.mvcapp.employees.Employee;
import com.example.mvcapp.screens.common.BaseObservableViewMvc;

import java.util.List;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public class MainActivityMvcViewImpl extends BaseObservableViewMvc<MainActivityViewMvc.Listener> implements MainActivityViewMvc {
    List<Employee> employeeList;
    private TextView tvHeading;

    public MainActivityMvcViewImpl(LayoutInflater inflater, @Nullable ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.activity_main, parent, false));
        tvHeading = findViewById(R.id.text_heading);
        tvHeading.setText("No Hello World");
    }

    @Override
    public void register(Listener listener) {

    }

    @Override
    public void unregister(Listener listener) {

    }

    @Override
    public void onBindView(List<Employee> employees) {
        employeeList = employees;
        tvHeading.setText(employeeList.get(0).getEmployeeName());
    }
}
