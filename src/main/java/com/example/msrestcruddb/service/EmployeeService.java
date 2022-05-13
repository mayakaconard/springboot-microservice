package com.example.msrestcruddb.service;

import com.example.msrestcruddb.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
public interface EmployeeService {

    public abstract void saveEmployee(Employee employee);
    public abstract List<Employee> getEmployees();
    public abstract void deleteEmployee(String id);
}
