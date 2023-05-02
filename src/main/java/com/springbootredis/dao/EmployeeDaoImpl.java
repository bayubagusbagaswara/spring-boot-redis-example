package com.springbootredis.dao;

import com.springbootredis.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {


    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Employee getOneEmployee(Integer id) {
        return null;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public Map<Integer, Employee> getAllEmployees() {
        return null;
    }

    @Override
    public void deleteEmployee(Integer id) {

    }

    @Override
    public void saveAllEmployees(Map<Integer, Employee> map) {

    }
}
