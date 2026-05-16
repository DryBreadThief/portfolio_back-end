package com.niarchos.portfolio_back_end.service;

import com.niarchos.portfolio_back_end.dto.CertificateDto;
import org.springframework.stereotype.Service;

import java.util.List;

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
                        ""
                ),
                new CertificateDto(
                        2L,
                        "Networking Fundamentals",
                        "Self Study / Lab Practice",
                        "In Progress",
                        "/assets/images/certificates/networking.webp",
                        ""
                ),
                new CertificateDto(
                        3L,
                        "Linux Server Administration",
                        "Self Study / Homelab",
                        "In Progress",
                        "/assets/images/certificates/linux.webp",
                        ""
                )
        );
        // ================= END TEMP FAKE DATA =================
    }
}
