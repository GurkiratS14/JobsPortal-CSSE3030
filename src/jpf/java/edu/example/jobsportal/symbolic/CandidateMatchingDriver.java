package edu.example.jobsportal.symbolic;

import edu.example.jobsportal.model.MatchResult;
import edu.example.jobsportal.service.CandidateMatchingService;

/**
 * Q3.1 Symbolic Pathfinder driver for CandidateMatchingService.evaluateCandidate().
 * Run via SPF using candidatematching.jpf (symbolic.method marks every
 * parameter below as symbolic; the concrete values here are placeholders
 * only, overwritten by SPF at run time).
 */
public class CandidateMatchingDriver {
    public static void main(String[] args) {
        CandidateMatchingService service = new CandidateMatchingService();
        MatchResult result = service.evaluateCandidate(0, 0, 0, 0, 0, true);
        System.out.println("Result: " + result);
    }
}
