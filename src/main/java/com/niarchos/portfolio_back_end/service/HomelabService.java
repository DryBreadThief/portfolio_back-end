package com.niarchos.portfolio_back_end.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niarchos.portfolio_back_end.dto.HomelabDto;

@Service
public class HomelabService {

    public List<HomelabDto> getAllHomelabs() {

        // ================= TEMP FAKE DATA - REPLACE WHEN DATABASE IS ADDED =================
        return List.of(
                new HomelabDto(
                        1L,
                        "Basic Home Server",
                        "A small server used for learning Linux, networking, Docker, and backend deployment.",
                        "Linux, Docker, SSH",
                        "/assets/images/homelabs/home-server.webp",
                        "In Progress",
                        true
                ),
                new HomelabDto(
                        2L,
                        "Network Segmentation Lab",
                        "A practice lab for separating frontend, backend, and database services into different network zones.",
                        "VLANs, Firewall, Nginx",
                        "/assets/images/homelabs/network-lab.webp",
                        "Planned",
                        true
                ),
                new HomelabDto(
                        3L,
                        "Docker Deployment Lab",
                        "A lab for deploying frontend and backend services with containers.",
                        "Docker, Docker Compose, Nginx",
                        "/assets/images/homelabs/docker-lab.webp",
                        "In Progress",
                        true
                ),
                new HomelabDto(
                        4L,
                        "Future Proxmox Lab",
                        "Placeholder for a future virtualization lab.",
                        "Proxmox, Linux, VMs",
                        "/assets/images/homelabs/default.webp",
                        "Planned",
                        false
                )
        );
        // ================= END TEMP FAKE DATA =================
    }

    public List<HomelabDto> getTopHomelabs() {
        return getAllHomelabs()
                .stream()
                .filter(HomelabDto::isTop)
                .toList();
    }
}