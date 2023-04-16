package com.raman.springboothibernate.crudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raman.springboothibernate.crudapi.dao.EmployeeDAO;
import com.raman.springboothibernate.crudapi.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

/*
 * It is necessary to use @Transactional as it ensures that the entire database operation is treated as
 * a single transaction, which means that if any part of the operation fails, the entire operation will
 * be rolled back to its initial state. This is important to maintain data consistency and integrity.
 */

    @Transactional
    @Override
    public List<Employee> getEmployee() {
        return employeeDAO.getEmployee();
    }

    @Transactional
    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void deleteEmployeeById(int id) {
        employeeDAO.deleteEmployeeById(id);
    }
    
}
