package edu.example.jobsportal.repository.memory;

import edu.example.jobsportal.model.Job;
import edu.example.jobsportal.repository.JobRepository;

import java.util.*;

public class InMemoryJobRepository implements JobRepository {
    private final Map<Long, Job> jobs = new LinkedHashMap<>();

    @Override
    public Job save(Job job) {
        jobs.put(job.getId(), job);
        return job;
    }

    @Override
    public Optional<Job> findById(long id) {
        return Optional.ofNullable(jobs.get(id));
    }

    @Override
    public List<Job> findAll() {
        return new ArrayList<>(jobs.values());
    }

    public void clear() {
        jobs.clear();
    }
}
