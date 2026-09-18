package edu.example.jobsportal.service;

import edu.example.jobsportal.model.Candidate;
import edu.example.jobsportal.model.Job;
import edu.example.jobsportal.model.JobApplication;
import edu.example.jobsportal.repository.ApplicationRepository;
import edu.example.jobsportal.repository.CandidateRepository;
import edu.example.jobsportal.repository.JobRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Q4.1 (behavioural) and Q4.2 (interaction) unit tests for
 * ApplicationService.apply(), using Mockito to isolate it from its four
 * dependencies (JobRepository, CandidateRepository, ApplicationRepository,
 * NotificationService).
 */
class ApplicationServiceMockitoTest {

    @Mock private JobRepository jobRepository;
    @Mock private CandidateRepository candidateRepository;
    @Mock private ApplicationRepository applicationRepository;
    @Mock private NotificationService notificationService;

    private ApplicationService applicationService;

    private Candidate candidate;
    private Job activeJob;

    private static final long CANDIDATE_ID = 1L;
    private static final long JOB_ID = 101L;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        applicationService = new ApplicationService(
                jobRepository, candidateRepository, applicationRepository, notificationService);

        candidate = new Candidate(CANDIDATE_ID, "Test Candidate", "candidate@example.com",
                Collections.emptySet());
        activeJob = new Job(JOB_ID, 9000, "Graduate Software Engineer",
                "This is a sufficiently detailed job description for testing purposes.",
                "Brisbane", "Technology", "Entry", false, 60000, 90000,
                LocalDate.now().plusDays(30));
        // active = true by default (see Job constructor)
    }

    // ==================== Q4.1 Behavioural tests ====================

    @Test
    void behaviour1_candidateDoesNotExist_throwsIllegalArgumentException() {
        // Expected: candidate lookup fails -> IllegalArgumentException("Candidate not found")
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.empty());

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> applicationService.apply(CANDIDATE_ID, JOB_ID));
        assertEquals("Candidate not found", ex.getMessage());
    }

    @Test
    void behaviour2_jobDoesNotExist_throwsIllegalArgumentException() {
        // Expected: candidate found, job lookup fails -> IllegalArgumentException("Job not found")
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.empty());

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> applicationService.apply(CANDIDATE_ID, JOB_ID));
        assertEquals("Job not found", ex.getMessage());
    }

    @Test
    void behaviour3_jobIsInactive_throwsIllegalStateException() {
        // Expected: job found but inactive -> IllegalStateException("Job is closed")
        activeJob.setActive(false);
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(activeJob));

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> applicationService.apply(CANDIDATE_ID, JOB_ID));
        assertEquals("Job is closed", ex.getMessage());
    }

    @Test
    void behaviour4_validApplication_submittedSuccessfully() {
        // Expected: candidate found, job found+active+open -> application created and returned
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(activeJob));
        when(applicationRepository.findByCandidateAndJob(CANDIDATE_ID, JOB_ID))
                .thenReturn(Collections.emptyList());
        when(applicationRepository.save(any(JobApplication.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        JobApplication result = applicationService.apply(CANDIDATE_ID, JOB_ID);

        assertNotNull(result);
        assertEquals(CANDIDATE_ID, result.getCandidateId());
        assertEquals(JOB_ID, result.getJobId());
    }

    @Test
    void behaviour5_applicationPeriodClosed_throwsIllegalStateException() {
        // Expected: job found+active but closingDate in the past -> IllegalStateException
        Job closedJob = new Job(JOB_ID, 9000, "Graduate Software Engineer",
                "This is a sufficiently detailed job description for testing purposes.",
                "Brisbane", "Technology", "Entry", false, 60000, 90000,
                LocalDate.now().minusDays(1));
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(closedJob));

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> applicationService.apply(CANDIDATE_ID, JOB_ID));
        assertEquals("Application period closed", ex.getMessage());
    }

    @Test
    void behaviour6_candidateAppliesTwice_shouldBeRejected_butIsNotDefect() {
        // Expected (per reasonable interpretation of "apply once per job"): the second
        // application attempt should be rejected, e.g. via an exception, since a prior
        // application by this candidate for this job already exists.
        //
        // No R-numbered requirement in the brief specifies the exact exception type or
        // message for this case, so this test's specific expectation (some RuntimeException
        // is thrown) is a reasonable interpretation, not a verbatim requirement.
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(activeJob));
        JobApplication priorApplication = new JobApplication(999L, CANDIDATE_ID, JOB_ID);
        when(applicationRepository.findByCandidateAndJob(CANDIDATE_ID, JOB_ID))
                .thenReturn(Collections.singletonList(priorApplication));

        // This assertion FAILS against the supplied implementation: apply() fetches
        // `existing` but never checks it, so a second application succeeds silently
        // instead of being rejected. See report Q4.1 for the defect discussion.
        assertThrows(RuntimeException.class,
                () -> applicationService.apply(CANDIDATE_ID, JOB_ID),
                "Expected duplicate application to be rejected, but apply() ignores `existing`");
    }

    // ==================== Q4.2 Interaction tests ====================

    @Test
    void interaction_successfulApplication_savesExactlyOnce() {
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(activeJob));
        when(applicationRepository.findByCandidateAndJob(CANDIDATE_ID, JOB_ID))
                .thenReturn(Collections.emptyList());
        when(applicationRepository.save(any(JobApplication.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        applicationService.apply(CANDIDATE_ID, JOB_ID);

        verify(applicationRepository, times(1)).save(any(JobApplication.class));
    }

    @Test
    void interaction_successfulApplication_sendsNotificationExactlyOnceWithCorrectArgs() {
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(activeJob));
        when(applicationRepository.findByCandidateAndJob(CANDIDATE_ID, JOB_ID))
                .thenReturn(Collections.emptyList());
        when(applicationRepository.save(any(JobApplication.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        applicationService.apply(CANDIDATE_ID, JOB_ID);

        verify(notificationService, times(1))
                .send(eq(candidate.getEmail()), anyString(), anyString());
    }

    @Test
    void interaction_rejectedBeforePersistence_neverSaves() {
        // Job inactive -> rejected before reaching applicationRepository.save(...)
        activeJob.setActive(false);
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(activeJob));

        assertThrows(IllegalStateException.class,
                () -> applicationService.apply(CANDIDATE_ID, JOB_ID));

        verify(applicationRepository, never()).save(any(JobApplication.class));
    }

    @Test
    void interaction_rejected_neverSendsNotification() {
        activeJob.setActive(false);
        when(candidateRepository.findById(CANDIDATE_ID)).thenReturn(Optional.of(candidate));
        when(jobRepository.findById(JOB_ID)).thenReturn(Optional.of(activeJob));

        assertThrows(IllegalStateException.class,
                () -> applicationService.apply(CANDIDATE_ID, JOB_ID));

        verify(notificationService, never()).send(anyString(), anyString(), anyString());
    }
}
