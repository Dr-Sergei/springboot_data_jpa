package com.sergei.spring.springboot_part2.spring_data_jpa.controller;


import com.sergei.spring.springboot_part2.spring_data_jpa.entity.Employee;
import com.sergei.spring.springboot_part2.spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();

        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        return employee;
    }

    //adding an employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.saveNewEmployee(employee);
        return employee;
    }

    //updating an employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveNewEmployee(employee);
        return employee;
    }

    //removing an employee
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        employeeService.deleteEmployee(id);
        return "Employee with id=" + id + " was successfully deleted!";
    }
}
