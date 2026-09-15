package edu.example.jobsportal.service;

import edu.example.jobsportal.model.*;
import edu.example.jobsportal.repository.*;

import java.time.LocalDate;
import java.util.List;

public class ApplicationService {
    private final JobRepository jobRepository;
    private final CandidateRepository candidateRepository;
    private final ApplicationRepository applicationRepository;
    private final NotificationService notificationService;

    public ApplicationService(JobRepository jobRepository,
                              CandidateRepository candidateRepository,
                              ApplicationRepository applicationRepository,
                              NotificationService notificationService) {
        this.jobRepository = jobRepository;
        this.candidateRepository = candidateRepository;
        this.applicationRepository = applicationRepository;
        this.notificationService = notificationService;
    }

    public JobApplication apply(long candidateId, long jobId) {
        Candidate candidate = candidateRepository.findById(candidateId)
                .orElseThrow(() -> new IllegalArgumentException("Candidate not found"));
        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new IllegalArgumentException("Job not found"));

        if (!job.isActive())
            throw new IllegalStateException("Job is closed");

        if (job.getClosingDate().isBefore(LocalDate.now()))
            throw new IllegalStateException("Application period closed");

        List<JobApplication> existing =
                applicationRepository.findByCandidateAndJob(candidateId, jobId);

        JobApplication application =
                new JobApplication(System.nanoTime(), candidate.getId(), job.getId());

        JobApplication saved = applicationRepository.save(application);
        notificationService.send(candidate.getEmail(), "Application submitted",
                "Your application has been submitted.");
        return saved;
    }

    public void changeStatus(long applicationId, ApplicationStatus newStatus) {
        JobApplication application = applicationRepository.findById(applicationId)
                .orElseThrow(() -> new IllegalArgumentException("Application not found"));

        application.setStatus(newStatus);
        applicationRepository.save(application);
    }
}
