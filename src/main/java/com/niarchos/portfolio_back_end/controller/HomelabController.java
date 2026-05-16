package com.niarchos.portfolio_back_end.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niarchos.portfolio_back_end.dto.HomelabDto;
import com.niarchos.portfolio_back_end.service.HomelabService;

@RestController
public class HomelabController {

    private final HomelabService homelabService;

    public HomelabController(HomelabService homelabService) {
        this.homelabService = homelabService;
    }

    @GetMapping("/api/homelabs")
    public List<HomelabDto> getAllHomelabs() {
        return homelabService.getAllHomelabs();
    }

    @GetMapping("/api/homelabs/top")
    public List<HomelabDto> getTopHomelabs() {
        return homelabService.getTopHomelabs();
    }
}
