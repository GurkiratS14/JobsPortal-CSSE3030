package edu.example.jobsportal.repository;

import edu.example.jobsportal.model.Job;
import java.util.*;

public interface JobRepository {
    Job save(Job job);
    Optional<Job> findById(long id);
    List<Job> findAll();
}
