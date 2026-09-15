package edu.example.jobsportal.fixtures;

import edu.example.jobsportal.model.Job;
import edu.example.jobsportal.repository.memory.InMemoryJobRepository;

import java.time.LocalDate;

/**
 * Fixed search dataset supplied for Assignment 1 Q1.2.
 * Students should use this fixture unchanged for the required combinatorial tests
 * so that search results are comparable across submissions.
 */
public final class JobSearchFixture {
    private JobSearchFixture() { }

    public static InMemoryJobRepository createRepository() {
        InMemoryJobRepository repo = new InMemoryJobRepository();
        LocalDate closing = LocalDate.now().plusDays(30);

        repo.save(job(101, "Junior Java Developer", "Brisbane", "Technology", "Entry", true, closing));
        repo.save(job(102, "Software Engineer", "Brisbane", "Technology", "Mid", false, closing));
        repo.save(job(103, "Senior Backend Engineer", "Sydney", "Technology", "Senior", true, closing));
        repo.save(job(104, "Graduate Data Analyst", "Sydney", "Finance", "Entry", false, closing));
        repo.save(job(105, "Risk Analyst", "Brisbane", "Finance", "Mid", true, closing));
        repo.save(job(106, "Senior Quantitative Analyst", "Sydney", "Finance", "Senior", false, closing));
        repo.save(job(107, "Cloud Engineer", "Brisbane", "Technology", "Senior", true, closing));
        repo.save(job(108, "Financial Systems Developer", "Sydney", "Finance", "Mid", true, closing));
        repo.save(job(109, "Graduate Software Tester", "Brisbane", "Technology", "Entry", false, closing));
        repo.save(job(110, "Senior Security Engineer", "Sydney", "Technology", "Senior", false, closing));
        repo.save(job(111, "Junior Finance Developer", "Brisbane", "Finance", "Entry", true, closing));
        Job inactive = job(112, "Legacy Java Developer", "Sydney", "Technology", "Mid", true, closing);
        inactive.setActive(false);
        repo.save(inactive);
        return repo;
    }

    private static Job job(long id, String title, String location, String industry,
                           String level, boolean remote, LocalDate closingDate) {
        return new Job(id, 9000 + id, title,
                "This is a sufficiently detailed fixture job description for assignment testing.",
                location, industry, level, remote, 60000, 120000, closingDate);
    }
}
