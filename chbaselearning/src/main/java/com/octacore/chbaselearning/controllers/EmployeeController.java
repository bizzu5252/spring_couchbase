package com.octacore.chbaselearning.controllers;

import com.octacore.chbaselearning.models.Employee;
import com.octacore.chbaselearning.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    @RequestMapping("/all")
    public Iterable<Employee> getAll(){
        return employeeRepository.findAll();
    }
}
