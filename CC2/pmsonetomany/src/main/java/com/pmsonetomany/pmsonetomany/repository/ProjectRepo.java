package com.pmsonetomany.pmsonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmsonetomany.pmsonetomany.model.Project;

public interface  ProjectRepo extends JpaRepository<Project,Long> {
    
}
