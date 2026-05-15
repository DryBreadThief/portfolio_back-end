package com.niarchos.portfolio_back_end.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niarchos.portfolio_back_end.dto.ProjectDto;

@Service
public class ProjectService {

    public List<ProjectDto> getAllProjects() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return List.of(
                new ProjectDto(
                        1L,
                        "Portfolio Website",
                        "Personal portfolio website with projects, homelab history, certificates, and contact section.",
                        "Angular, Spring Boot",
                        "/assets/images/projects/portfolio.webp",
                        "https://github.com/YOUR_USERNAME/portfolio-site",
                        ""
                ),
                new ProjectDto(
                        2L,
                        "Homelab Network",
                        "Homelab setup for learning networking, servers, Docker, and secure deployment.",
                        "Linux, Docker, Nginx",
                        "/assets/images/projects/homelab.webp",
                        "",
                        ""
                ),
                new ProjectDto(
                        3L,
                        "Backend API",
                        "Spring Boot REST API for serving portfolio data.",
                        "Java, Spring Boot",
                        "/assets/images/projects/backend.webp",
                        "https://github.com/YOUR_USERNAME/portfolio-backend",
                        ""
                )
        );
        // ================= END TEMP FAKE DATA =================
    }
}
