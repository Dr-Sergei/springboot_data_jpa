package com.sergei.spring.springboot_part2.spring_data_jpa.dao;

import com.sergei.spring.springboot_part2.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String Name);
}
