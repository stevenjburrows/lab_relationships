package com.example.codeclan.lab_relationships.repository;

import com.example.codeclan.lab_relationships.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

