package com.example.mvcapp.screens.employeelist;

import com.example.mvcapp.employees.Employee;
import com.example.mvcapp.employees.EmployeeSchema;
import com.example.mvcapp.screens.common.ObservableViewMvc;

import java.util.List;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public interface MainActivityViewMvc extends ObservableViewMvc<MainActivityViewMvc.Listener> {
    void onBindView(List<Employee> employeeSchema);

    interface Listener {
        void onEmployeeClicked(EmployeeSchema employeeSchema);
    }
}
