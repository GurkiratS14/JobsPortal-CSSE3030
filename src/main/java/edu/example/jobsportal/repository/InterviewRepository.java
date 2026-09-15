package edu.example.jobsportal.repository;

import edu.example.jobsportal.model.Interview;
import java.util.*;

public interface InterviewRepository {
    Interview save(Interview interview);
    List<Interview> findByCandidate(long candidateId);
    List<Interview> findByEmployer(long employerId);
}
