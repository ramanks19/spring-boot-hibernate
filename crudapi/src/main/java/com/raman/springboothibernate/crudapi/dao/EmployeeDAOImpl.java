package com.raman.springboothibernate.crudapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raman.springboothibernate.crudapi.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployee() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = query.getResultList();
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee empObj = currentSession.get(Employee.class, id);
        return empObj;
    }

    @Override
    public void save(Employee employee) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee empObj = currentSession.get(Employee.class, id);
        currentSession.delete(empObj);
    }
    
}
