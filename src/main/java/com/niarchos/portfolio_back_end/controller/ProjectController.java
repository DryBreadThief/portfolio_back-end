package com.niarchos.portfolio_back_end.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niarchos.portfolio_back_end.dto.ProjectDto;
import com.niarchos.portfolio_back_end.service.ProjectService;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/api/projects")
    public List<ProjectDto> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/api/projects/top")
    public List<ProjectDto> getTopProjects() {
        return projectService.getTopProjects();
    }
}
