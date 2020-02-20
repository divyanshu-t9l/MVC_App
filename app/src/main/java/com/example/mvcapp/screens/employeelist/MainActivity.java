package com.example.mvcapp.screens.employeelist;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.mvcapp.employees.Employee;
import com.example.mvcapp.employees.EmployeeSchema;
import com.example.mvcapp.networking.MyCustomAPI;
import com.example.mvcapp.screens.common.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements MainActivityMvcViewImpl.Listener {
    //private static final String TAG = "MainActivity";
    private MainActivityViewMvc mViewMvc;
    private MyCustomAPI mCustomAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewMvc = getCompositonRoot().getViewMvcFactory().getMainActivityViewMvc(null);
        mCustomAPI = getCompositonRoot().getMyCustomAPI();
        setContentView(mViewMvc.getRootView());
    }

    @Override
    protected void onStart() {
        super.onStart();
        fetchEmployees();
    }

    private void fetchEmployees() {
        Call<EmployeeSchema> mEmployeeListCall = mCustomAPI.employeesList();
        mEmployeeListCall.enqueue(new Callback<EmployeeSchema>() {
            @Override
            public void onResponse(@NonNull Call<EmployeeSchema> call, @NonNull Response<EmployeeSchema> response) {
                if (response.code() == 200 && response.body() != null && response.body().getStatus().equals("success")) {
                    onBindView(response.body());
                } else {
                    networkCallFailed();
                }
            }

            @Override
            public void onFailure(@NonNull Call<EmployeeSchema> call, @NonNull Throwable t) {
                // networkCallFailed();
            }
        });
    }

    private void networkCallFailed() {
        Toast.makeText(this, "Network call failed", Toast.LENGTH_SHORT).show();
    }

    private void onBindView(EmployeeSchema body) {
        List<Employee> employeeList = new ArrayList<>(body.getData().size());
        for (Employee employee : body.getData()) {
            employeeList.add(new Employee(employee.getId(), employee.getEmployeeName()));
        }
        mViewMvc.onBindView(employeeList);
        // TODO: Provide data to adapter
    }

    @Override
    public void onEmployeeClicked(EmployeeSchema employeeSchema) {

    }
}
