package edu.example.jobsportal.repository;

import edu.example.jobsportal.model.Candidate;
import java.util.*;

public interface CandidateRepository {
    Optional<Candidate> findById(long id);
}
