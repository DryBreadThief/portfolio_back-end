package com.niarchos.portofolio_back_end.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

    @GetMapping("/api/health")
    public String healthCheck() {
        return "Backend is running";
    }
}