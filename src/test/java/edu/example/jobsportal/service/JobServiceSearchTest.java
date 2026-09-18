package edu.example.jobsportal.service;

import edu.example.jobsportal.fixtures.JobSearchFixture;
import edu.example.jobsportal.model.Job;
import edu.example.jobsportal.repository.memory.InMemoryJobRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q1.2 Combinatorial (pairwise) tests for JobService.search().
 * Uses JobSearchFixture.createRepository() UNCHANGED, as required by the brief.
 *
 * Fixture reference (active jobs only; id 112 is inactive and must never appear):
 * 101 Junior Java Developer        Brisbane  Technology  Entry   remote=true
 * 102 Software Engineer            Brisbane  Technology  Mid     remote=false
 * 103 Senior Backend Engineer      Sydney    Technology  Senior  remote=true
 * 104 Graduate Data Analyst        Sydney    Finance     Entry   remote=false
 * 105 Risk Analyst                 Brisbane  Finance     Mid     remote=true
 * 106 Senior Quantitative Analyst  Sydney    Finance     Senior  remote=false
 * 107 Cloud Engineer               Brisbane  Technology  Senior  remote=true
 * 108 Financial Systems Developer  Sydney    Finance     Mid     remote=true
 * 109 Graduate Software Tester     Brisbane  Technology  Entry   remote=false
 * 110 Senior Security Engineer     Sydney    Technology  Senior  remote=false
 * 111 Junior Finance Developer     Brisbane  Finance     Entry   remote=true
 * 112 Legacy Java Developer        Sydney    Technology  Mid     remote=true  (INACTIVE)
 */
class JobServiceSearchTest {

    private JobService jobService;

    @BeforeEach
    void setUp() {
        InMemoryJobRepository repo = JobSearchFixture.createRepository();
        jobService = new JobService(repo);
    }

    @Test
    void keyword_location_industry_experience_remote_allSpecified_singleMatch() {
        // Pairwise row 1: Developer / Brisbane / Technology / Entry / true
        // Only job 101 satisfies every filter simultaneously.
        List<Job> results = jobService.search("Developer", "Brisbane", "Technology", "Entry", true);
        assertEquals(1, results.size());
        assertEquals(101L, results.get(0).getId());
    }

    @Test
    void keyword_location_industry_experience_remote_allSpecified_otherSingleMatch() {
        // Developer / Sydney / Finance / Mid / true -> only job 108 matches all five.
        List<Job> results = jobService.search("Developer", "Sydney", "Finance", "Mid", true);
        assertEquals(1, results.size());
        assertEquals(108L, results.get(0).getId());
    }

    @Test
    void noKeyword_location_industry_experience_remote_rejectsOnRemoteMismatch() {
        // Pairwise row 2: unspecified keyword / Brisbane / Finance / Mid / false
        // Job 105 is the only Brisbane+Finance+Mid job, but it is remote=true,
        // so the remote=false filter correctly excludes it -> empty result.
        List<Job> results = jobService.search(null, "Brisbane", "Finance", "Mid", false);
        assertTrue(results.isEmpty(),
                "Job 105 is remote=true; remote=false filter should exclude it, giving no matches");
    }

    @Test
    void keyword_location_industry_experience_remote_rejectsOnKeywordMismatch() {
        // Pairwise row 5: Developer / Sydney / Finance / Senior / false
        // Job 106 matches location+industry+experience+remote exactly, but its
        // title "Senior Quantitative Analyst" does not contain "Developer",
        // so the keyword filter correctly excludes it -> empty result.
        // This demonstrates a genuine keyword x other-parameter interaction.
        List<Job> results = jobService.search("Developer", "Sydney", "Finance", "Senior", false);
        assertTrue(results.isEmpty(),
                "Job 106 matches every filter except keyword; keyword filter should exclude it");
    }

    @Test
    void noKeyword_noLocation_industry_experience_remote_locationUnspecifiedMatchesAcrossLocations() {
        // Pairwise row 8: unspecified keyword / unspecified location / Finance / Entry / true
        // Only job 111 is Finance+Entry+remote=true (job 104 is Finance+Entry but remote=false).
        // Location left unspecified confirms it correctly does not restrict results
        // to a single location.
        List<Job> results = jobService.search(null, null, "Finance", "Entry", true);
        assertEquals(1, results.size());
        assertEquals(111L, results.get(0).getId());
    }
}
