package edu.example.jobsportal.repository.memory;

import edu.example.jobsportal.model.Interview;
import edu.example.jobsportal.repository.InterviewRepository;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryInterviewRepository implements InterviewRepository {
    private final Map<Long, Interview> interviews = new LinkedHashMap<>();

    @Override
    public Interview save(Interview interview) {
        interviews.put(interview.getId(), interview);
        return interview;
    }

    @Override
    public List<Interview> findByCandidate(long candidateId) {
        return interviews.values().stream()
                .filter(i -> i.getCandidateId() == candidateId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Interview> findByEmployer(long employerId) {
        return interviews.values().stream()
                .filter(i -> i.getEmployerId() == employerId)
                .collect(Collectors.toList());
    }

    public void clear() {
        interviews.clear();
    }
}
