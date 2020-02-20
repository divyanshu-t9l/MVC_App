package com.example.mvcapp.employees;

/**
 * Created by Divyanshu  on 19/2/20.
 * T9L
 * divyanshu@t9l.com
 */

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class EmployeeSchema implements Serializable, Parcelable {

    public final static Parcelable.Creator<EmployeeSchema> CREATOR = new Creator<EmployeeSchema>() {


        @SuppressWarnings({
                "unchecked"
        })
        public EmployeeSchema createFromParcel(Parcel in) {
            return new EmployeeSchema(in);
        }

        public EmployeeSchema[] newArray(int size) {
            return (new EmployeeSchema[size]);
        }

    };
    private final static long serialVersionUID = 5680764793879078074L;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private List<Employee> data = null;

    protected EmployeeSchema(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (Employee.class.getClassLoader()));
    }

    public EmployeeSchema() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Employee> getData() {
        return data;
    }

    public void setData(List<Employee> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeList(data);
    }

    public int describeContents() {
        return 0;
    }

}