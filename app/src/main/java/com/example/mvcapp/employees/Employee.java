package com.example.mvcapp.employees;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */
public class Employee implements Serializable, Parcelable {

    public final static Parcelable.Creator<Employee> CREATOR = new Creator<Employee>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Employee createFromParcel(Parcel in) {
            return new Employee(in);
        }

        public Employee[] newArray(int size) {
            return (new Employee[size]);
        }

    };
    private final static long serialVersionUID = -6076302094950859513L;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("employee_name")
    @Expose
    private String employeeName;
    @SerializedName("employee_salary")
    @Expose
    private String employeeSalary;
    @SerializedName("employee_age")
    @Expose
    private String employeeAge;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;

    protected Employee(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.employeeName = ((String) in.readValue((String.class.getClassLoader())));
        this.employeeSalary = ((String) in.readValue((String.class.getClassLoader())));
        this.employeeAge = ((String) in.readValue((String.class.getClassLoader())));
        this.profileImage = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Employee() {
    }

    public Employee(String id, String employeeName) {
        this.id = id;
        this.employeeName = employeeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(employeeName);
        dest.writeValue(employeeSalary);
        dest.writeValue(employeeAge);
        dest.writeValue(profileImage);
    }

    public int describeContents() {
        return 0;
    }

}