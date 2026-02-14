package com.jsp.job_portal.dto;

public class Jobs {
    private String title;
    private String description;
    private String company;

    public Jobs() {}
    public Jobs(String title, String description, String company) {
        this.title = title;
        this.description = description;
        this.company = company;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
}

