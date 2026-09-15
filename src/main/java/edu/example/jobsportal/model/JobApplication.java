package edu.example.jobsportal.model;

public class JobApplication {
    private final long id;
    private final long candidateId;
    private final long jobId;
    private ApplicationStatus status;

    public JobApplication(long id, long candidateId, long jobId) {
        this.id = id;
        this.candidateId = candidateId;
        this.jobId = jobId;
        this.status = ApplicationStatus.SUBMITTED;
    }

    public long getId() { return id; }
    public long getCandidateId() { return candidateId; }
    public long getJobId() { return jobId; }
    public ApplicationStatus getStatus() { return status; }
    public void setStatus(ApplicationStatus status) { this.status = status; }
}
