package edu.example.jobsportal.repository.memory;

import edu.example.jobsportal.model.Candidate;
import edu.example.jobsportal.repository.CandidateRepository;

import java.util.*;

public class InMemoryCandidateRepository implements CandidateRepository {
    private final Map<Long, Candidate> candidates = new LinkedHashMap<>();

    public Candidate save(Candidate candidate) {
        candidates.put(candidate.getId(), candidate);
        return candidate;
    }

    @Override
    public Optional<Candidate> findById(long id) {
        return Optional.ofNullable(candidates.get(id));
    }

    public void clear() {
        candidates.clear();
    }
}
