package com.raman.springboothibernate.crudapi.service;

import java.util.List;

import com.raman.springboothibernate.crudapi.entity.Employee;

public interface EmployeeService {
    List<Employee> getEmployee();

    Employee getEmployeeById(int id);

    void save(Employee employee);

    void deleteEmployeeById(int id);
}
