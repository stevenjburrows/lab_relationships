package com.example.codeclan.lab_relationships.repository;

import com.example.codeclan.lab_relationships.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
