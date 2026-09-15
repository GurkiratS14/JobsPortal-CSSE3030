package edu.example.jobsportal.service;

import edu.example.jobsportal.model.Job;
import edu.example.jobsportal.repository.JobRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class JobService {
    private static final Set<String> VALID_LEVELS =
            Collections.unmodifiableSet(new HashSet<String>(
                    Arrays.asList("Entry", "Mid", "Senior", "Executive")));

    private final JobRepository repository;

    public JobService(JobRepository repository) {
        this.repository = repository;
    }

    public Job createJob(long employerId, String title, String description,
                         String location, String industry, String experienceLevel,
                         boolean remote, double salaryMin, double salaryMax,
                         LocalDate closingDate) {
        if (title == null || title.trim().length() < 5 || title.trim().length() > 100)
            throw new IllegalArgumentException("Invalid title");
        if (description == null || description.trim().length() < 50)
            throw new IllegalArgumentException("Description too short");
        if (!VALID_LEVELS.contains(experienceLevel))
            throw new IllegalArgumentException("Invalid experience level");

        if (salaryMin > salaryMax)
            throw new IllegalArgumentException("Invalid salary range");
        if (closingDate.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Closing date is in the past");

        Job job = new Job(System.nanoTime(), employerId, title.trim(), description.trim(),
                location, industry, experienceLevel, remote, salaryMin, salaryMax, closingDate);
        return repository.save(job);
    }

    public List<Job> search(String keyword, String location, String industry,
                            String experienceLevel, Boolean remote) {
        return repository.findAll().stream()
                .filter(Job::isActive)
                .filter(j -> keyword == null || isBlank(keyword)
                        || j.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .filter(j -> location == null || isBlank(location)
                        || j.getLocation().equalsIgnoreCase(location))
                .filter(j -> industry == null || isBlank(industry)
                        || j.getIndustry().equalsIgnoreCase(industry))
                .filter(j -> experienceLevel == null || isBlank(experienceLevel)
                        || j.getExperienceLevel().equalsIgnoreCase(experienceLevel))
                .filter(j -> remote == null || j.isRemote() == remote)
                .collect(Collectors.toList());
    }

    private boolean isBlank(String value) {
        for (int index = 0; index < value.length();) {
            int codePoint = value.codePointAt(index);
            if (!Character.isWhitespace(codePoint)) {
                return false;
            }
            index += Character.charCount(codePoint);
        }
        return true;
    }
}
