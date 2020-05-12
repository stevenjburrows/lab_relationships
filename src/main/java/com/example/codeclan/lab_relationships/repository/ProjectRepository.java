package com.example.codeclan.lab_relationships.repository;

import com.example.codeclan.lab_relationships.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
