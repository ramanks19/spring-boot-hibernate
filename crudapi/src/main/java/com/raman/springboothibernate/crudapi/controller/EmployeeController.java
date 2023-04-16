package com.raman.springboothibernate.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raman.springboothibernate.crudapi.entity.Employee;
import com.raman.springboothibernate.crudapi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employeeObj) {
        employeeService.save(employeeObj);
        return employeeObj;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employeeObj = employeeService.getEmployeeById(id);
        if (employeeObj == null) {
            throw new RuntimeException("Employee not found for id: " + id);
        }
        return employeeObj;
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employeeObj) {
        employeeService.save(employeeObj);
        return employeeObj;
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        employeeService.deleteEmployeeById(id);
        return "Employee has been deleted with id: " + id;
    }
}
