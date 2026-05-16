package com.niarchos.portfolio_back_end.controller;

import com.niarchos.portfolio_back_end.dto.ProfileDto;
import com.niarchos.portfolio_back_end.service.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/api/profile")
    public ProfileDto getProfile() {
        return profileService.getProfile();
    }
}
