package com.raman.springboothibernate.crudapi.dao;

import java.util.List;

import com.raman.springboothibernate.crudapi.entity.Employee;

public interface EmployeeDAO {
    List<Employee> getEmployee();

    Employee getEmployeeById(int id);

    void save(Employee employee);

    void deleteEmployeeById(int id);
}
