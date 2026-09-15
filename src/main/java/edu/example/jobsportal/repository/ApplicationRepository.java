package edu.example.jobsportal.repository;

import edu.example.jobsportal.model.*;
import java.util.*;

public interface ApplicationRepository {
    JobApplication save(JobApplication application);
    Optional<JobApplication> findById(long id);
    List<JobApplication> findByCandidateAndJob(long candidateId, long jobId);
}
