package edu.example.jobsportal.service;

import edu.example.jobsportal.model.Job;
import java.util.List;

public class SearchService {
    private final JobService jobService;

    public SearchService(JobService jobService) {
        this.jobService = jobService;
    }

    public List<Job> searchRemoteJobs(String keyword, String location) {
        return jobService.search(keyword, location, null, null, true);
    }
}
