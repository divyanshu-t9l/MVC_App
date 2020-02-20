package com.example.mvcapp.screens.employeestatus;

import com.example.mvcapp.employees.EmployeeSchema;
import com.example.mvcapp.screens.common.ObservableViewMvc;

/**
 * Created by Divyanshu  on 20/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public interface EmployeeStatusActivityViewMvc extends ObservableViewMvc<EmployeeStatusActivityViewMvc.Listener> {

    void onBindView();

    interface Listener {
        void onEmployeeClicked(EmployeeSchema employeeSchema);
    }
}
