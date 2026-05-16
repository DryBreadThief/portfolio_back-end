package com.niarchos.portfolio_back_end.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niarchos.portfolio_back_end.dto.CertificateDto;

@Service
public class CertificateService {

    public List<CertificateDto> getAllCertificates() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return List.of(
                new CertificateDto(
                        1L,
                        "CompTIA A+",
                        "CompTIA",
                        "In Progress",
                        "/assets/images/certificates/comptia-a-plus.webp",
                        "",
                        true
                ),
                new CertificateDto(
                        2L,
                        "Networking Fundamentals",
                        "Self Study / Lab Practice",
                        "In Progress",
                        "/assets/images/certificates/networking.webp",
                        "",
                        true
                ),
                new CertificateDto(
                        3L,
                        "Linux Server Administration",
                        "Self Study / Homelab",
                        "In Progress",
                        "/assets/images/certificates/linux.webp",
                        "",
                        true
                ),
                new CertificateDto(
                        4L,
                        "Future Certificate",
                        "To be decided",
                        "Planned",
                        "/assets/images/certificates/default.webp",
                        "",
                        false
                )
        );
        // ================= END TEMP FAKE DATA =================
    }

    public List<CertificateDto> getTopCertificates() {
        return getAllCertificates()
                .stream()
                .filter(CertificateDto::isTop)
                .toList();
    }
}