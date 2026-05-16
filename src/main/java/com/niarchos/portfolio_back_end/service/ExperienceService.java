package com.niarchos.portfolio_back_end.service;

import com.niarchos.portfolio_back_end.dto.ExperienceDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    public List<ExperienceDto> getAllExperience() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return List.of(
                new ExperienceDto(
                        1L,
                        "Helpdesk / IT Support",
                        "Company / Organization Name",
                        "2024",
                        "Present",
                        "Providing technical support, troubleshooting user issues, handling tickets, and assisting with IT operations.",
                        "Jira, Windows, Linux, Networking"
                ),
                new ExperienceDto(
                        2L,
                        "SOC / Monitoring Practice",
                        "Learning / Work Environment",
                        "2024",
                        "Present",
                        "Learning security monitoring concepts, QRadar basics, events, flows, and infrastructure health monitoring.",
                        "QRadar, XClarity, Logs, Monitoring"
                ),
                new ExperienceDto(
                        3L,
                        "Portfolio Backend Development",
                        "Personal Project",
                        "2026",
                        "Present",
                        "Building a Spring Boot backend for serving portfolio data to an Angular frontend.",
                        "Java, Spring Boot, REST API"
                )
        );
        // ================= END TEMP FAKE DATA =================
    }
}
