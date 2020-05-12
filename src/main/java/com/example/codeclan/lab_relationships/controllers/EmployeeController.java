package com.example.codeclan.lab_relationships.controllers;

import com.example.codeclan.lab_relationships.models.Employee;
import com.example.codeclan.lab_relationships.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() {return employeeRepository.findAll();}

    @GetMapping(value = "/emplyees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){return employeeRepository.findById(id);}
}

