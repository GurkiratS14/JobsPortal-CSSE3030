package edu.example.jobsportal.service;

import edu.example.jobsportal.model.Candidate;
import edu.example.jobsportal.model.Job;
import edu.example.jobsportal.model.JobApplication;
import edu.example.jobsportal.repository.memory.InMemoryApplicationRepository;
import edu.example.jobsportal.repository.memory.InMemoryCandidateRepository;
import edu.example.jobsportal.repository.memory.InMemoryJobRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q2.2 Data-flow (All-Uses) tests for ApplicationService.apply().
 * Three tests give All-Uses coverage of every def-use pair identified in (a):
 * candidate (uses at candidate.getId(), candidate.getEmail()),
 * job (uses at job.isActive(), job.getClosingDate(), job.getId()),
 * application (use at applicationRepository.save(application)),
 * saved (use at return saved).
 *
 * A no-op NotificationService is used here since this file is about data-flow
 * coverage, not interaction verification (that's Q4.2, using Mockito).
 */
class ApplicationServiceDataFlowTest {

    private InMemoryCandidateRepository candidateRepo;
    private InMemoryJobRepository jobRepo;
    private InMemoryApplicationRepository applicationRepo;
    private ApplicationService applicationService;

    @BeforeEach
    void setUp() {
        candidateRepo = new InMemoryCandidateRepository();
        jobRepo = new InMemoryJobRepository();
        applicationRepo = new InMemoryApplicationRepository();
        NotificationService noOpNotificationService = (email, subject, message) -> { };
        applicationService = new ApplicationService(jobRepo, candidateRepo, applicationRepo, noOpNotificationService);
    }

    private Candidate saveCandidate(long id) {
        Candidate candidate = new Candidate(id, "Test Candidate", "candidate" + id + "@example.com",
                Collections.emptySet());
        candidateRepo.save(candidate);
        return candidate;
    }

    private Job saveJob(long id, boolean active, LocalDate closingDate) {
        Job job = new Job(id, 9000 + id, "Graduate Software Engineer",
                "This is a sufficiently detailed job description for assignment testing purposes.",
                "Brisbane", "Technology", "Entry", false, 60000, 90000, closingDate);
        job.setActive(active);
        jobRepo.save(job);
        return job;
    }

    @Test
    void jobInactive_coversJobUseAtIsActiveCheck() {
        // Covers DU pair (job@28, use@31) on the TRUE branch: job.isActive() == false.
        saveCandidate(1);
        saveJob(101, false, LocalDate.now().plusDays(30));

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> applicationService.apply(1, 101));
        assertEquals("Job is closed", ex.getMessage());
    }

    @Test
    void jobActiveButClosingDatePassed_coversJobUseAtClosingDateCheck() {
        // Covers DU pair (job@28, use@31) FALSE branch (must be active to reach line 34)
        // and (job@28, use@34) TRUE branch: closingDate is before today.
        saveCandidate(2);
        saveJob(102, true, LocalDate.now().minusDays(1));

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> applicationService.apply(2, 102));
        assertEquals("Application period closed", ex.getMessage());
    }

    @Test
    void validApplication_coversCandidateJobApplicationSavedUses() {
        // Full success path. Covers:
        // (candidate@26, use@41 candidate.getId()), (candidate@26, use@44 candidate.getEmail()),
        // (job@28, use@41 job.getId()), (application@40, use@43 save(application)),
        // (saved@43, use@46 return saved).
        Candidate candidate = saveCandidate(3);
        Job job = saveJob(103, true, LocalDate.now().plusDays(30));

        JobApplication result = applicationService.apply(3, 103);

        assertNotNull(result);
        assertEquals(candidate.getId(), result.getCandidateId());
        assertEquals(job.getId(), result.getJobId());
    }
}