package com.example.mvcapp.screens.employeedetails;

import com.example.mvcapp.employees.Employee;
import com.example.mvcapp.screens.common.ObservableViewMvc;

/**
 * Created by Divyanshu  on 20/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public interface EmployeeActivityViewMvc extends ObservableViewMvc<EmployeeActivityViewMvc.Listener> {
    void onBindView();

    interface Listener {
        void onEmployeeClicked(Employee employee);
    }

}
