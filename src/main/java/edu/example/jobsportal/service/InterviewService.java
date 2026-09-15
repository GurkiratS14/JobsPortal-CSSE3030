package edu.example.jobsportal.service;

import edu.example.jobsportal.model.Interview;
import edu.example.jobsportal.repository.InterviewRepository;

import java.time.LocalDateTime;
import java.util.List;

public class InterviewService {
    private final InterviewRepository repository;

    public InterviewService(InterviewRepository repository) {
        this.repository = repository;
    }

    public Interview schedule(long candidateId, long employerId,
                              LocalDateTime start, int durationMinutes, String type) {
        if (start.isBefore(LocalDateTime.now()))
            throw new IllegalArgumentException("Interview must be in the future");
        if (durationMinutes < 15 || durationMinutes > 180)
            throw new IllegalArgumentException("Invalid duration");

        List<Interview> candidateInterviews = repository.findByCandidate(candidateId);
        List<Interview> employerInterviews = repository.findByEmployer(employerId);

        for (Interview i : candidateInterviews) {
            if (overlaps(i, start, durationMinutes))
                throw new IllegalStateException("Candidate has an overlapping interview");
        }
        for (Interview i : employerInterviews) {
            if (overlaps(i, start, durationMinutes))
                throw new IllegalStateException("Employer has an overlapping interview");
        }

        return repository.save(new Interview(System.nanoTime(), candidateId, employerId,
                start, durationMinutes, type));
    }

    private boolean overlaps(Interview existing, LocalDateTime start, int duration) {
        LocalDateTime end = start.plusMinutes(duration);
        LocalDateTime existingEnd =
                existing.getStart().plusMinutes(existing.getDurationMinutes());
        return start.isBefore(existingEnd) && existing.getStart().isBefore(end);
    }
}
