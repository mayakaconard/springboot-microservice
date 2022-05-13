package com.example.msrestcruddb.service;
import com.example.msrestcruddb.model.Employee;
import com.example.msrestcruddb.repository.EmployeeRepository;
import com.example.msrestcruddb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository repo;
    @Override
    public void saveEmployee(Employee employee) {
        repo.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {

        return repo.findAll();
    }

    @Override
    public void deleteEmployee(String id) {
        repo.deleteById(id);
    }
}
