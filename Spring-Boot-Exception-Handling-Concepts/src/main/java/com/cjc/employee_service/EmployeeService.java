package com.cjc.employee_service;

import com.cjc.model.Employee;

public interface EmployeeService {

    public Employee postEmployee(Employee employee);

    public Employee getEmployee(int id);
}
