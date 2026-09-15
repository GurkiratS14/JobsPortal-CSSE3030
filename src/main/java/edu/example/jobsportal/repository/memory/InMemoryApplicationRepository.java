package edu.example.jobsportal.repository.memory;

import edu.example.jobsportal.model.JobApplication;
import edu.example.jobsportal.repository.ApplicationRepository;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryApplicationRepository implements ApplicationRepository {
    private final Map<Long, JobApplication> applications = new LinkedHashMap<>();

    @Override
    public JobApplication save(JobApplication application) {
        applications.put(application.getId(), application);
        return application;
    }

    @Override
    public Optional<JobApplication> findById(long id) {
        return Optional.ofNullable(applications.get(id));
    }

    @Override
    public List<JobApplication> findByCandidateAndJob(long candidateId, long jobId) {
        return applications.values().stream()
                .filter(a -> a.getCandidateId() == candidateId && a.getJobId() == jobId)
                .collect(Collectors.toList());
    }

    public List<JobApplication> findAll() {
        return new ArrayList<>(applications.values());
    }

    public void clear() {
        applications.clear();
    }
}
