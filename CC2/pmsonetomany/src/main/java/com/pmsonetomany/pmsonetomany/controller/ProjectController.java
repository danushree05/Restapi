package com.pmsonetomany.pmsonetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pmsonetomany.pmsonetomany.model.Project;
import com.pmsonetomany.pmsonetomany.service.ProjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;



@RestController

public class ProjectController {
    @Autowired
    ProjectService projectService;
    @PostMapping("/api/post/project")
    public Project addProject(@RequestBody Project project)
    {
        return projectService.addProjects(project);
    }
    @GetMapping("/api/get/project")
    public List<Project> getproject()
    {
        return projectService.getProjects();
    }
   
    

}
