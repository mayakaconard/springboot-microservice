package com.example.msrestcruddb.controller;

import com.example.msrestcruddb.model.Employee;
import com.example.msrestcruddb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Its a Rest Controller
@RestController

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);

        return new ResponseEntity<String>("Employee Added Successfully!", HttpStatus.OK) ;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
        return "Deleted Successfully";
    }
}
