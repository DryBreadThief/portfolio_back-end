package com.niarchos.portfolio_back_end.controller;

import com.niarchos.portfolio_back_end.dto.ExperienceDto;
import com.niarchos.portfolio_back_end.service.ExperienceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/api/experience")
    public List<ExperienceDto> getAllExperience() {
        return experienceService.getAllExperience();
    }
}
