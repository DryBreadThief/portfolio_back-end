package com.niarchos.portfolio_back_end.controller;

import com.niarchos.portfolio_back_end.dto.CertificateDto;
import com.niarchos.portfolio_back_end.service.CertificateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CertificateController {

    private final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @GetMapping("/api/certificates")
    public List<CertificateDto> getAllCertificates() {
        return certificateService.getAllCertificates();
    }
}
