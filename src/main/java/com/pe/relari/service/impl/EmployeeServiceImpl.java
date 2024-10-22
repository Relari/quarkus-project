package com.pe.relari.service.impl;

import jakarta.inject.Singleton;
import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.service.EmployeeService;

import java.util.List;

@Singleton
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employees = EmployeeRepository.employees();

    public Employee getEmployee(Integer employeeId) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(employeeId))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findAll() {
        return employees;
    }

}
