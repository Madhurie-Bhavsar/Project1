package com.cjc.employee_service;

import com.cjc.custom_exceptions.invalidIdException;
import com.cjc.model.Employee;
import com.cjc.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceIMPL implements  EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee postEmployee(Employee employee) {
        if(employee.getEid()<99 || employee.getEid()>999)
            throw new NullPointerException();
        else {
            Employee save = employeeRepo.save(employee);
            return save;
        }
    }

    @Override
    public Employee getEmployee(int id) {
        Optional<Employee> byId = employeeRepo.findById(id);
        return byId.get();
    }
}
