package edu.example.jobsportal.service;

import edu.example.jobsportal.model.MatchResult;

/**
 * Evaluates a candidate against simplified job requirements.
 *
 * This method is intentionally compact but branch-rich so that it can be
 * analysed using Symbolic Pathfinder as part of the testing assignment.
 */
public class CandidateMatchingService {

    public MatchResult evaluateCandidate(
            int yearsExperience,
            int requiredExperience,
            int matchedSkills,
            int requiredSkills,
            int assessmentScore,
            boolean authorisedToWork) {

        if (!authorisedToWork) {
            return MatchResult.INELIGIBLE;
        }

        if (yearsExperience < 0
                || requiredExperience < 0
                || matchedSkills < 0
                || requiredSkills < 0
                || assessmentScore < 0
                || assessmentScore > 100) {
            return MatchResult.INVALID;
        }

        if (yearsExperience < requiredExperience) {
            if (assessmentScore >= 85) {
                return MatchResult.POTENTIAL;
            }
            return MatchResult.INSUFFICIENT_EXPERIENCE;
        }

        if (matchedSkills < requiredSkills) {
            return MatchResult.INSUFFICIENT_SKILLS;
        }

        if (yearsExperience >= requiredExperience + 3
                && assessmentScore >= 80) {
            return MatchResult.STRONG_MATCH;
        }

        return MatchResult.ELIGIBLE;
    }
}
