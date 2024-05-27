package com.sergei.spring.springboot_part2.spring_data_jpa.service;

import com.sergei.spring.springboot_part2.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

   public void saveNewEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
