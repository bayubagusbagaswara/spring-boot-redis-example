package com.springbootredis.dao;

import com.springbootredis.model.Employee;

import java.util.Map;

public interface IEmployeeDao {

    void saveEmployee(Employee employee);
    Employee getOneEmployee(Integer id);
    void updateEmployee(Employee employee);
    Map<Integer, Employee> getAllEmployees();
    void deleteEmployee(Integer id);
    void saveAllEmployees(Map<Integer, Employee> map);

}
