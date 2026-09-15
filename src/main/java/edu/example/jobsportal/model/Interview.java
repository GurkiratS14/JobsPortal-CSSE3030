package edu.example.jobsportal.model;

import java.time.LocalDateTime;

public class Interview {
    private final long id;
    private final long candidateId;
    private final long employerId;
    private final LocalDateTime start;
    private final int durationMinutes;
    private final String type;

    public Interview(long id, long candidateId, long employerId,
                     LocalDateTime start, int durationMinutes, String type) {
        this.id = id;
        this.candidateId = candidateId;
        this.employerId = employerId;
        this.start = start;
        this.durationMinutes = durationMinutes;
        this.type = type;
    }

    public long getId() { return id; }
    public long getCandidateId() { return candidateId; }
    public long getEmployerId() { return employerId; }
    public LocalDateTime getStart() { return start; }
    public int getDurationMinutes() { return durationMinutes; }
    public String getType() { return type; }
}
