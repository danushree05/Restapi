package com.pmsonetomany.pmsonetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmsonetomany.pmsonetomany.model.Project;
import com.pmsonetomany.pmsonetomany.repository.ProjectRepo;

@Service

public class ProjectService {
    @Autowired
    ProjectRepo projectRepo;
    @SuppressWarnings("null")
    public Project addProjects(Project project)
    {
        return projectRepo.save(project);
    }
    public List<Project> getProjects()
    {
        return projectRepo.findAll();
    }
}
