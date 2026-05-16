package com.niarchos.portfolio_back_end.dto;

public class HomelabDto {
    private Long id;
    private String title;
    private String description;
    private String techStack;
    private String imageUrl;
    private String status;

    public HomelabDto(Long id, String title, String description, String techStack, String imageUrl, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getStatus() {
        return status;
    }
}
