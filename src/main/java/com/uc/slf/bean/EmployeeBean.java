package com.uc.slf.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Garima";

    @Autowired
    private DepartmentBean department; // Injecting DepartmentBean

    public String getEmployeeDetails() {
        return "Employee: " + name + ", Department: " + department.getDeptName();
    }
}

