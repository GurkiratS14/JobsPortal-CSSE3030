package edu.example.jobsportal.model;

import java.time.LocalDate;
import java.util.*;

public class Job {
    private final long id;
    private final long employerId;
    private String title;
    private String description;
    private String location;
    private String industry;
    private String experienceLevel;
    private boolean remote;
    private double salaryMin;
    private double salaryMax;
    private LocalDate closingDate;
    private boolean active;

    public Job(long id, long employerId, String title, String description,
               String location, String industry, String experienceLevel,
               boolean remote, double salaryMin, double salaryMax,
               LocalDate closingDate) {
        this.id = id;
        this.employerId = employerId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.industry = industry;
        this.experienceLevel = experienceLevel;
        this.remote = remote;
        this.salaryMin = salaryMin;
        this.salaryMax = salaryMax;
        this.closingDate = closingDate;
        this.active = true;
    }

    public long getId() { return id; }
    public long getEmployerId() { return employerId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
    public String getIndustry() { return industry; }
    public String getExperienceLevel() { return experienceLevel; }
    public boolean isRemote() { return remote; }
    public double getSalaryMin() { return salaryMin; }
    public double getSalaryMax() { return salaryMax; }
    public LocalDate getClosingDate() { return closingDate; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
