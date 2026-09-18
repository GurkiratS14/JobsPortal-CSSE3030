package edu.example.jobsportal.service;

import edu.example.jobsportal.model.Job;
import edu.example.jobsportal.repository.memory.InMemoryJobRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q1.1 Equivalence Partitioning and Boundary Value Analysis tests for
 * JobService.createJob(), derived from requirements R1-R5 (see report Q1.1 a-c).
 */
class JobServiceCreateJobTest {

    private JobService jobService;

    // Fixed valid baseline values re-used across tests so each test only varies
    // the one field under study (classic EP/BVA hygiene).
    private static final long EMPLOYER_ID = 1L;
    private static final String VALID_TITLE = "Graduate Software Engineer"; // 27 chars
    private static final String VALID_DESCRIPTION =
            "We are looking for a graduate software engineer to join our growing team."; // 76 chars
    private static final String VALID_LOCATION = "Brisbane";
    private static final String VALID_INDUSTRY = "Technology";
    private static final String VALID_LEVEL = "Mid";
    private static final double VALID_SALARY_MIN = 60000;
    private static final double VALID_SALARY_MAX = 90000;
    private static final LocalDate VALID_CLOSING_DATE = LocalDate.now().plusDays(30);

    @BeforeEach
    void setUp() {
        jobService = new JobService(new InMemoryJobRepository());
    }

    private Job createWith(String title, String description, String experienceLevel,
                           double salaryMin, double salaryMax, LocalDate closingDate) {
        return jobService.createJob(EMPLOYER_ID, title, description, VALID_LOCATION,
                VALID_INDUSTRY, experienceLevel, false, salaryMin, salaryMax, closingDate);
    }

    // Java 8 has no String.repeat(); build fixed-length strings manually.
    private static String repeat(char c, int count) {
        char[] chars = new char[count];
        Arrays.fill(chars, c);
        return new String(chars);
    }

    // ---------- R1: Title ----------

    @Test
    void title_valid_withinRange_accepted() {
        // EP: valid class, trimmed length 5-100
        Job job = createWith(VALID_TITLE, VALID_DESCRIPTION, VALID_LEVEL,
                VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE);
        assertEquals(VALID_TITLE, job.getTitle());
    }

    @Test
    void title_boundary_fourChars_rejected() {
        // BVA: just below minimum boundary (length 4)
        assertThrows(IllegalArgumentException.class, () ->
                createWith("abcd", VALID_DESCRIPTION, VALID_LEVEL,
                        VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE));
    }

    @Test
    void title_boundary_fiveChars_accepted() {
        // BVA: exactly at minimum boundary (length 5)
        Job job = createWith("abcde", VALID_DESCRIPTION, VALID_LEVEL,
                VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE);
        assertEquals("abcde", job.getTitle());
    }

    @Test
    void title_boundary_hundredChars_accepted() {
        // BVA: exactly at maximum boundary (length 100)
        String title = repeat('A', 100);
        Job job = createWith(title, VALID_DESCRIPTION, VALID_LEVEL,
                VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE);
        assertEquals(100, job.getTitle().length());
    }

    @Test
    void title_boundary_hundredOneChars_rejected() {
        // BVA: just above maximum boundary (length 101)
        String title = repeat('A', 101);
        assertThrows(IllegalArgumentException.class, () ->
                createWith(title, VALID_DESCRIPTION, VALID_LEVEL,
                        VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE));
    }

    @Test
    void title_null_rejected() {
        // EP: invalid class, null
        assertThrows(IllegalArgumentException.class, () ->
                createWith(null, VALID_DESCRIPTION, VALID_LEVEL,
                        VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE));
    }

    // ---------- R2: Description ----------

    @Test
    void description_boundary_fortyNineChars_rejected() {
        // BVA: just below minimum boundary (length 49)
        String description = repeat('a', 49);
        assertThrows(IllegalArgumentException.class, () ->
                createWith(VALID_TITLE, description, VALID_LEVEL,
                        VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE));
    }

    @Test
    void description_null_rejected() {
        // EP: invalid class, null — distinct bytecode branch from the "too short" case,
        // since the description check is a compound condition (null || too short).
        assertThrows(IllegalArgumentException.class, () ->
                createWith(VALID_TITLE, null, VALID_LEVEL,
                        VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE));
    }

    @Test
    void description_boundary_fiftyChars_accepted() {
        // BVA: exactly at minimum boundary (length 50)
        String description = repeat('a', 50);
        Job job = createWith(VALID_TITLE, description, VALID_LEVEL,
                VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE);
        assertEquals(50, job.getDescription().length());
    }

    // ---------- R3: Salary range ----------

    @Test
    void salary_valid_minLessThanMax_accepted() {
        // EP: valid class, min < max
        Job job = createWith(VALID_TITLE, VALID_DESCRIPTION, VALID_LEVEL, 50000, 70000,
                VALID_CLOSING_DATE);
        assertEquals(50000, job.getSalaryMin());
        assertEquals(70000, job.getSalaryMax());
    }

    @Test
    void salary_boundary_minEqualsMax_accepted() {
        // BVA: equal boundary, min == max
        Job job = createWith(VALID_TITLE, VALID_DESCRIPTION, VALID_LEVEL, 60000, 60000,
                VALID_CLOSING_DATE);
        assertEquals(job.getSalaryMin(), job.getSalaryMax());
    }

    @Test
    void salary_minGreaterThanMax_rejected() {
        // EP/BVA: invalid class, min just above max
        assertThrows(IllegalArgumentException.class, () ->
                createWith(VALID_TITLE, VALID_DESCRIPTION, VALID_LEVEL, 60001, 60000,
                        VALID_CLOSING_DATE));
    }

    @Test
    void salary_negativeMin_currentlyAccepted_documentsDefect() {
        // R3 requires salaryMin and salaryMax to be non-negative. createJob() only
        // checks salaryMin > salaryMax, so a negative salaryMin is NOT rejected.
        // This test documents the observed (incorrect) behaviour for Q1.1(e):
        // it asserts what the system ACTUALLY does, not what R3 requires.
        Job job = createWith(VALID_TITLE, VALID_DESCRIPTION, VALID_LEVEL, -1, 50000,
                VALID_CLOSING_DATE);
        assertEquals(-1, job.getSalaryMin(),
                "Defect: negative salaryMin is accepted even though R3 requires non-negative salaries");
    }

    // ---------- R4: Closing date ----------

    @Test
    void closingDate_boundary_today_accepted() {
        // BVA: boundary, closing date == today
        Job job = createWith(VALID_TITLE, VALID_DESCRIPTION, VALID_LEVEL,
                VALID_SALARY_MIN, VALID_SALARY_MAX, LocalDate.now());
        assertEquals(LocalDate.now(), job.getClosingDate());
    }

    @Test
    void closingDate_boundary_yesterday_rejected() {
        // BVA: just below boundary, closing date == yesterday
        assertThrows(IllegalArgumentException.class, () ->
                createWith(VALID_TITLE, VALID_DESCRIPTION, VALID_LEVEL,
                        VALID_SALARY_MIN, VALID_SALARY_MAX, LocalDate.now().minusDays(1)));
    }

    // ---------- R5: Experience level ----------

    @Test
    void experienceLevel_valid_eachAllowedValue_accepted() {
        // EP: valid class, one representative per allowed value
        for (String level : new String[]{"Entry", "Mid", "Senior", "Executive"}) {
            Job job = createWith(VALID_TITLE, VALID_DESCRIPTION, level,
                    VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE);
            assertEquals(level, job.getExperienceLevel());
        }
    }

    @Test
    void experienceLevel_wrongCase_rejected() {
        // EP: invalid class, case-sensitive mismatch
        assertThrows(IllegalArgumentException.class, () ->
                createWith(VALID_TITLE, VALID_DESCRIPTION, "entry",
                        VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE));
    }

    @Test
    void experienceLevel_unknownValue_rejected() {
        // EP: invalid class, value outside the allowed set
        assertThrows(IllegalArgumentException.class, () ->
                createWith(VALID_TITLE, VALID_DESCRIPTION, "Intern",
                        VALID_SALARY_MIN, VALID_SALARY_MAX, VALID_CLOSING_DATE));
    }
}