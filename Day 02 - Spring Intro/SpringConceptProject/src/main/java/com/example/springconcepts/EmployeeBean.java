package com.example.springconcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    @Autowired
    private DepartmentBean departmentBean; 

    public String getEmployeeName() {
        return "Bhaskar";
    }

    public String getEmployeeDetails() {
        return getEmployeeName() + " - " + departmentBean.getDepartmentName();
    }
}
