package com.cjc.controller;

import com.cjc.employee_service.EmployeeService;
import com.cjc.model.Employee;
import com.cjc.model.Project;
import com.cjc.project_service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @PostMapping("/postEmployee")
    public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee){
        Employee postEmployee = employeeService.postEmployee(employee);
        return new ResponseEntity<Employee>(postEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        return new ResponseEntity<Employee>(employee,HttpStatus.FOUND);
    }

    @PostMapping("/postProject")
    public ResponseEntity<Project> postProject(@RequestBody Project project){
        Project postProject = projectService.postProject(project);
        return new ResponseEntity<Project>(postProject,HttpStatus.CREATED);
    }

    @GetMapping("/getProject/{id}")
    public ResponseEntity<Project> getProject(@PathVariable int id){
        Project project = projectService.getProject(id);
        return new ResponseEntity<Project>(project,HttpStatus.FOUND);
    }
}
