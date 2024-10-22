package com.pe.relari.service;

import com.pe.relari.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getEmployee(Integer employeeId);
    List<Employee> findAll();

}
