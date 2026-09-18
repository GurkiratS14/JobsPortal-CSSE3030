package edu.example.jobsportal.service;

import edu.example.jobsportal.model.MatchResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Q3.1 — JUnit tests converted directly from SPF's actual reported concrete
 * inputs (see candidatematching.jpf run output; report Q3.1 b-c).
 */
class CandidateMatchingServiceSpfTest {

    private final CandidateMatchingService service = new CandidateMatchingService();

    @Test
    void notAuthorised_returnsIneligible() {
        assertEquals(MatchResult.INELIGIBLE,
                service.evaluateCandidate(0, 0, 0, 0, 0, false));
    }

    @Test
    void assessmentScoreOver100_returnsInvalid() {
        assertEquals(MatchResult.INVALID,
                service.evaluateCandidate(0, 0, 0, 0, 101, true));
    }

    @Test
    void underExperiencedWithHighScore_returnsPotential() {
        assertEquals(MatchResult.POTENTIAL,
                service.evaluateCandidate(0, 1, 0, 0, 85, true));
    }

    @Test
    void underExperiencedWithLowScore_returnsInsufficientExperience() {
        assertEquals(MatchResult.INSUFFICIENT_EXPERIENCE,
                service.evaluateCandidate(0, 1, 0, 0, 0, true));
    }

    @Test
    void enoughExperienceButNotEnoughSkills_returnsInsufficientSkills() {
        assertEquals(MatchResult.INSUFFICIENT_SKILLS,
                service.evaluateCandidate(0, 0, 0, 1, 0, true));
    }

    @Test
    void wellOverExperiencedWithHighScore_returnsStrongMatch() {
        assertEquals(MatchResult.STRONG_MATCH,
                service.evaluateCandidate(3, 0, 0, 0, 80, true));
    }

    @Test
    void meetsRequirementsExactly_returnsEligible() {
        assertEquals(MatchResult.ELIGIBLE,
                service.evaluateCandidate(0, 0, 0, 0, 0, true));
    }
}