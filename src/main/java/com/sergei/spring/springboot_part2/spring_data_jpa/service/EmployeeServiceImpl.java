package com.sergei.spring.springboot_part2.spring_data_jpa.service;

import com.sergei.spring.springboot_part2.spring_data_jpa.dao.EmployeeRepository;
import com.sergei.spring.springboot_part2.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveNewEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(final int id) {
        Employee employee = null;

        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employee = optional.get();
        }
        return employee;
    }

    @Override
    public void deleteEmployee(final int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(final String name) {

        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }
}
