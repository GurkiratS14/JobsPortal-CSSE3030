package edu.example.jobsportal.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) '4', (int) (short) -1, (int) (byte) 100, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 0, (-1), (int) (byte) 1, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass29 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (short) 10, (int) '#', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (short) 0, 10, 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 10, (int) (short) -1, (int) '#', (int) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 1, (int) '#', (int) (short) 1, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 1, 0, (int) '#', (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (-1), (int) 'a', (int) (short) 1, (int) '4', true);
        java.lang.Class<?> wildcardClass57 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 100, 0, (int) (byte) -1, (int) 'a', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 1, (int) (byte) 0, (int) 'a', (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(0, 0, (int) (byte) 0, (int) '4', (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass64 = matchResult63.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) ' ', (int) 'a', (int) (byte) 0, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) 'a', (int) (short) 1, 100, (int) '4', false);
        java.lang.Class<?> wildcardClass36 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 100, 1, 1, (int) ' ', true);
        java.lang.Class<?> wildcardClass57 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) '4', (int) (short) 100, 1, true);
        java.lang.Class<?> wildcardClass8 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) '#', (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((-1), (int) ' ', (int) ' ', (int) (byte) -1, 100, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 1, 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 100, (int) 'a', (int) (short) 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (byte) -1, (int) (byte) 1, (int) (byte) -1, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(100, (-1), (int) (short) 10, (-1), (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(1, 0, (int) (byte) 100, (int) (short) 1, 100, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 10, (int) (byte) 0, 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 0, (int) (byte) -1, (int) (byte) 1, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) 'a', (int) 'a', 0, (-1), false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 10, (int) '#', (int) (byte) -1, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), 10, (int) (short) 0, (int) (short) 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 100, 0, (int) (short) -1, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) -1, (int) ' ', (int) (short) 0, 10, true);
        java.lang.Class<?> wildcardClass64 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 0, (int) (short) 1, 100, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 1, 0, 0, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass50 = matchResult49.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) -1, (int) (short) 0, (int) (short) 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 0, (int) ' ', 10, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(10, 1, (int) (byte) 1, (int) (short) 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(0, (int) '4', 1, (int) '4', 10, false);
        java.lang.Class<?> wildcardClass85 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 0, (int) (short) 100, 10, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) ' ', (int) '#', (int) (byte) 0, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, 0, (int) (byte) -1, 1, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 0, (int) (short) 10, (int) '#', (int) (byte) -1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (short) -1, (int) (short) 10, (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 0, (int) (short) -1, 0, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 1, (int) (short) 1, (int) ' ', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) '#', (int) (short) 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 0, 1, (int) (short) 1, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (byte) 0, (int) (short) 0, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(10, (int) (byte) -1, (int) '#', (int) (short) 10, (int) (short) 0, false);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 10, 0, (int) (byte) 0, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 100, 10, (int) 'a', (int) '4', true);
        java.lang.Class<?> wildcardClass50 = matchResult49.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) -1, (int) (byte) -1, (int) '#', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, 0, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (int) (byte) 0, (int) 'a', (int) (byte) 100, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(100, (int) ' ', (int) (byte) 0, (int) ' ', (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(1, 10, 100, (int) (byte) 1, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass78 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) -1, (int) (short) 0, (int) (short) 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) '#', (int) 'a', (int) (byte) 1, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 1, (int) (byte) 10, (int) (short) 1, (int) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (-1), (int) (short) 0, 10, (int) (byte) 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) -1, (int) (byte) -1, (int) '#', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) -1, (int) (byte) 1, (int) (byte) -1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', 100, 0, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 0, (int) (short) 1, (int) '#', (int) (short) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 100, (int) (byte) 100, (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (short) 10, (int) '#', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (short) 0, 10, 0, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass29 = matchResult28.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 1, 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 100, (int) 'a', (int) (short) 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 0, 100, 10, 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 0, (int) (short) 100, 10, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) ' ', (int) '#', (int) (byte) 0, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, 0, (int) (byte) -1, 1, (-1), false);
        java.lang.Class<?> wildcardClass43 = matchResult42.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 0, (int) (byte) 10, (-1), (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (-1), (int) '#', 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) ' ', (int) (byte) -1, 10, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 10, 1, 0, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 0, 0, (int) (short) -1, (int) (short) 100, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 0, (int) (short) 1, 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) 100, (int) (short) -1, 10, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) 'a', (int) (short) 10, 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (byte) 10, (int) (byte) 100, 100, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (-1), (int) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 0, (int) (short) -1, (int) ' ', (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 10, 1, (int) 'a', (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (byte) 0, 10, (int) (short) 100, (-1), false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 1, (int) ' ', (-1), 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 0, (int) ' ', (int) '#', (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) 0, (int) (short) 100, (int) '#', (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) 1, 0, (-1), (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) 'a', (int) ' ', 0, (int) '#', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        java.lang.Class<?> wildcardClass36 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 10, (int) ' ', 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(10, 0, 0, (int) ' ', (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 1, (int) (short) 0, (int) (byte) 100, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 100, 0, (int) (short) 10, (int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 0, (int) (byte) 10, (-1), (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (-1), (int) '#', 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 1, (int) ' ', 0, (int) (byte) 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '#', 10, (-1), 100, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 1, (int) '#', (int) (byte) 100, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 1, 100, 1, (int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) '#', (int) (short) 1, (-1), (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) '#', 100, (int) (short) 0, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, 0, (int) '4', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (byte) 0, (int) (byte) 1, (int) (short) 0, (int) (byte) -1, false);
        java.lang.Class<?> wildcardClass36 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (byte) 100, (int) 'a', (-1), (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 0, (int) '#', (int) (byte) 0, (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 0, (int) (short) 1, 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 0, (int) (byte) 1, (int) '#', (int) 'a', true);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) 'a', 0, (int) (byte) 1, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, 100, (int) (short) -1, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) 10, (int) (byte) 0, (int) 'a', (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, 0, (int) (short) 10, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult91 = candidateMatchingService0.evaluateCandidate(10, (int) (short) -1, (int) (short) 1, (int) (byte) -1, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult98 = candidateMatchingService0.evaluateCandidate((int) '4', (-1), (int) (short) 100, (int) (byte) 0, 0, true);
        java.lang.Class<?> wildcardClass99 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult91 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult91.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult98 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult98.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 100, (int) (byte) 100, 1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '#', (int) (short) -1, (int) (byte) 1, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) -1, (int) ' ', 10, (int) '#', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (short) -1, (int) (short) 10, (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 0, (int) (short) -1, 0, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (short) 1, 10, (int) (short) 1, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 1, (int) '4', 10, (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) 100, 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (-1), (int) (short) 1, (int) 'a', (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 1, 0, (int) (byte) 0, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(0, (int) ' ', 1, (int) (short) 0, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (-1), (int) (short) 1, (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) -1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (int) ' ', (int) '4', (int) (byte) 1, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass43 = matchResult42.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) 100, (int) (short) 100, (int) (short) 100, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(100, (int) (byte) -1, (int) (byte) 0, (int) (byte) 100, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) 1, (int) (byte) -1, (int) (byte) 1, (int) (short) 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 10, 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (byte) 0, 0, (int) (short) 0, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) -1, (int) (byte) 1, (int) 'a', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, (int) '#', (int) '4', (int) (short) 10, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (int) ' ', (int) (byte) -1, (int) '4', (int) '#', true);
        java.lang.Class<?> wildcardClass43 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 100, (int) (byte) 0, (int) (short) 1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), 10, (int) (short) 100, (int) (byte) 10, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) '#', 10, 10, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 10, 100, (int) (byte) 10, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 0, 0, (int) 'a', (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 0, (int) (byte) 100, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 0, (int) (byte) -1, (int) (byte) -1, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(1, 0, 0, 10, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 10, 0, (int) (short) -1, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 1, (int) (byte) -1, (-1), (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((-1), (int) ' ', 0, (int) (byte) 0, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (byte) 0, (int) ' ', (int) (byte) 100, (int) (byte) 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 1, (int) '#', (int) '#', 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 0, (int) (byte) -1, 10, (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '#', (int) ' ', (int) (short) 100, (int) (byte) 0, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (-1), 1, (int) (short) -1, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 1, 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 100, (int) 'a', (int) (short) 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (byte) -1, (int) (byte) 1, (int) (byte) -1, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) '4', (int) (byte) 100, 0, 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 100, 0, (int) (byte) -1, (int) 'a', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) ' ', 10, (int) (short) 1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 1, (int) (byte) 100, 100, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) 'a', 100, (int) (byte) -1, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) '4', (int) (byte) 100, (int) (byte) 0, (int) 'a', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (short) -1, (int) (byte) 1, (int) ' ', (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '#', 100, (int) (short) 0, (int) (short) 100, (int) 'a', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) ' ', (int) (short) 10, 10, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 1, (int) (short) -1, 0, 0, true);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 0, (int) (byte) 10, (-1), (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (-1), (int) '#', 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(10, 10, (int) (byte) 100, (int) (short) 1, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) ' ', (int) (byte) 1, (int) (short) 10, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass78 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (int) (byte) 0, (int) (short) 0, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) 'a', (int) '#', (int) (short) -1, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) (short) 1, (int) '4', true);
        java.lang.Class<?> wildcardClass57 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) -1, 10, (int) (short) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) 'a', (int) (short) -1, 0, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', (int) (short) 1, (int) (byte) 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (short) 10, (int) (short) 0, (int) 'a', 100, false);
        java.lang.Class<?> wildcardClass43 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 1, (int) '#', (int) '#', 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) -1, (int) (byte) 0, 100, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, 100, 0, (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) 10, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (byte) 1, 100, 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) '#', 1, (int) (short) -1, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 1, (int) (short) 100, (int) (byte) 10, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) 1, (int) (short) -1, (int) (short) 10, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) ' ', (int) (byte) 1, (int) (byte) 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 1, 100, 100, 1, true);
        java.lang.Class<?> wildcardClass71 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(1, 10, (int) (byte) 0, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 0, 0, (int) (short) 0, (int) (byte) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 1, 1, (int) (short) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 0, (int) (short) 10, (int) (byte) 0, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, 0, (int) (short) 10, (int) ' ', (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(10, (int) (short) 1, (int) 'a', 0, 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) (byte) -1, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) 100, (int) '#', 1, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) ' ', (-1), (int) (byte) -1, 100, true);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) ' ', (int) (byte) 10, (int) (byte) 0, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) -1, (int) '4', 100, (int) (short) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) '4', 10, (int) 'a', (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 1, (int) (byte) -1, 1, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) 'a', (int) ' ', 100, 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '4', 1, 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, (-1), (int) (byte) 10, 100, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) -1, (int) 'a', 0, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) 0, (int) (short) 10, (int) '4', 100, true);
        java.lang.Class<?> wildcardClass78 = matchResult77.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) '#', (int) (short) 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 10, (int) (byte) -1, (int) (short) 0, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '#', 0, (int) (short) 0, (int) '#', (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) '#', (-1), (int) 'a', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass50 = matchResult49.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) -1, (int) (byte) -1, (int) ' ', (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 1, (int) ' ', (int) ' ', (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 10, (int) '4', (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(0, (int) (short) -1, (-1), (int) (byte) -1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult91 = candidateMatchingService0.evaluateCandidate(0, 0, (int) (short) -1, (int) (byte) -1, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult98 = candidateMatchingService0.evaluateCandidate((int) 'a', 10, (int) (short) -1, (int) (short) 10, 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult91 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult91.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult98 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult98.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), 0, (int) (byte) 100, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 100, 100, (-1), (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) -1, (int) (short) 100, (int) '#', (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 0, (int) (byte) 100, (int) (short) 10, (int) '#', true);
        java.lang.Class<?> wildcardClass64 = matchResult63.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) -1, (int) (short) 0, (int) (short) 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((-1), (int) '4', (int) (byte) 0, 1, (int) '#', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) '#', (int) (short) 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 10, (int) (byte) -1, (int) (short) 0, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) '4', (int) (byte) -1, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(10, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) '4', false);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) ' ', (int) '4', (int) (short) -1, (int) (short) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) 10, (int) (byte) 10, (int) (byte) 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 10, 1, (int) (byte) 10, (int) (short) -1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) ' ', (int) (short) 1, (int) (short) -1, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) 1, (int) '#', (int) (short) 10, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, 1, (int) (byte) 0, 10, (int) (short) -1, true);
        java.lang.Class<?> wildcardClass43 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '4', (int) (short) -1, 100, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 1, (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, (int) '4', (int) (byte) 1, 10, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 1, (int) (short) 1, (int) '#', (int) (short) 100, true);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 10, 10, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (int) (byte) 1, (int) (short) 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 1, (int) (byte) 0, (int) (byte) 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) (short) 100, 1, 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) -1, (int) (byte) -1, (int) '#', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, 0, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (int) (byte) 0, (int) 'a', (int) (byte) 100, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(100, (int) ' ', (int) (byte) 0, (int) ' ', (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(100, (int) ' ', (int) (byte) -1, (int) '4', (int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 100, 1, 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 100, (int) (byte) 100, (int) (short) 10, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(100, (int) 'a', 1, 0, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 10, (int) (byte) 1, (int) ' ', 100, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) '#', (int) (short) 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 0, 1, (int) (short) 1, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, 1, 1, (int) ' ', (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, 10, (int) ' ', (int) (byte) 1, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) '4', (int) ' ', 100, (int) '4', (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 1, (-1), (int) (short) -1, (int) (short) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 100, 10, (int) (short) 0, (int) (short) 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 10, (int) (byte) 0, 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 0, (int) (byte) -1, (int) (byte) 1, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) -1, (int) (byte) 100, 0, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 10, (int) (short) 1, (int) (short) 1, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) 100, (int) (short) 100, 10, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(0, 100, 100, (int) (short) 0, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 10, (-1), (int) 'a', (int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) '#', (int) (short) 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) ' ', (int) '#', (int) (short) 0, (int) 'a', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (-1), (-1), (int) (short) 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 1, (int) (byte) 0, 100, (int) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (short) 0, (int) (byte) 0, 100, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '4', (int) (short) 1, (int) (short) -1, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) '#', (int) ' ', (int) '4', 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(10, (int) (byte) 1, (int) (byte) 100, (int) (byte) 0, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 100, (int) ' ', 0, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 1, 1, 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(1, (-1), (int) '#', (int) '#', (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 1, (int) (short) 100, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) '4', (int) (short) 1, (int) (byte) 100, (int) '#', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 100, 100, (int) 'a', 1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (byte) 0, (int) (short) 10, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 1, (int) (short) 0, (int) (byte) 0, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 10, 100, 0, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) (short) 100, (int) (short) 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', 1, (int) (byte) 1, (-1), (int) (short) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) ' ', 0, 0, (int) (short) 0, 0, true);
        java.lang.Class<?> wildcardClass64 = matchResult63.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 10, (int) (byte) 0, 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 0, (int) (byte) -1, (int) (byte) 1, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) -1, (int) (byte) 100, 0, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 10, (int) (short) 1, (int) (short) 1, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, 10, (int) (byte) 1, (int) (short) 0, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 1, 0, 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (byte) 0, (int) (short) 10, (int) ' ', (int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 0, (int) (short) 100, (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) '#', (int) ' ', 10, 0, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 0, (int) 'a', (int) (short) 0, (int) (short) 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) '#', 100, (int) (byte) 1, (int) (byte) -1, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) 1, (int) (short) 0, (int) '#', true);
        java.lang.Class<?> wildcardClass29 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) -1, (int) (short) 0, (int) (short) 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 0, (int) ' ', 10, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(1, 0, 0, (int) (short) 100, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass78 = matchResult77.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) '4', (int) '4', (int) (byte) 10, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (byte) -1, (int) (byte) 1, (int) '#', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (byte) 0, (int) '#', (int) (short) -1, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(100, 10, 0, (int) (short) 0, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '#', 1, (-1), (int) 'a', 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((-1), (-1), (int) (byte) 1, (int) ' ', (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (short) 100, (int) 'a', (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (byte) 10, (int) 'a', (int) (byte) 1, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (short) 1, 0, (int) (byte) 10, 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 100, (int) (short) -1, (int) (short) 100, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, 100, (int) (byte) 0, (int) (byte) -1, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass71 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) '#', (int) (short) 1, (-1), (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(10, (-1), (int) (short) 1, (-1), (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) '4', (int) (short) 1, 100, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass29 = matchResult28.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) 100, 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (-1), (int) (short) 1, (int) 'a', (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (int) '#', (int) '4', 0, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 1, (int) (byte) 0, (int) ' ', 0, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '4', (int) '#', (int) ' ', (int) (short) 0, true);
        java.lang.Class<?> wildcardClass78 = matchResult77.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 10, 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((-1), 0, (-1), (int) (byte) -1, (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 100, (-1), (int) (byte) -1, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) 'a', (int) (short) 10, 1, 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) -1, (int) (byte) -1, (int) ' ', (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 1, (int) ' ', (int) ' ', (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 10, (int) '4', (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 10, (int) ' ', 0, 0, true);
        java.lang.Class<?> wildcardClass85 = matchResult84.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 100, (int) (short) 100, (int) (short) -1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', (int) (byte) 1, 1, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) 'a', (int) (short) 10, (int) (short) 100, (int) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) -1, (int) (byte) -1, (int) ' ', (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 1, (int) ' ', (int) ' ', (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) ' ', (int) ' ', (int) (byte) 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 0, 1, (int) (short) 10, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(100, (int) (short) 0, (int) '#', (int) (short) -1, (int) (short) -1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) ' ', (-1), (int) (short) -1, (int) (short) 0, true);
        java.lang.Class<?> wildcardClass43 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 10, (int) (byte) -1, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (short) 0, (int) (short) 0, (int) (byte) 0, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(10, (int) (short) -1, (int) ' ', (int) (short) 100, (int) (byte) -1, false);
        java.lang.Class<?> wildcardClass50 = matchResult49.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((-1), (-1), (int) (byte) 1, (int) ' ', (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (short) 100, (int) 'a', (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (byte) 10, (int) 'a', (int) (byte) 1, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, 0, (int) (short) 10, (int) (byte) 0, (int) (short) -1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', 100, 0, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 100, (int) (byte) -1, (int) ' ', 10, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) 10, 10, (int) 'a', (int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) ' ', (int) (byte) 1, (int) 'a', (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) 10, (-1), 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(10, (int) (byte) 100, 10, (-1), (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '#', 0, 1, (int) (short) 0, (int) '#', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate(0, (int) ' ', (int) '#', (int) (byte) 10, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, (int) (short) 0, (int) (short) 0, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) 10, (int) (byte) 10, (int) '4', (int) (short) 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 100, 0, (int) (byte) -1, (int) 'a', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 1, (int) (byte) 0, (int) 'a', (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (short) 10, (int) (short) 1, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(10, (-1), (int) (byte) 100, (int) (short) 1, (int) (short) -1, true);
        java.lang.Class<?> wildcardClass71 = matchResult70.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (-1), (int) (short) 1, (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) -1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(10, 100, (int) (byte) 1, (int) (short) 10, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 0, (int) (byte) -1, (int) (short) 100, (int) ' ', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 0, (int) (short) 1, 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) 100, (int) (short) -1, 10, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) (short) 100, (int) ' ', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass57 = matchResult56.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) '#', (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass43 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (-1), (int) (short) 1, (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '4', (int) '#', 10, (int) (byte) -1, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 10, (int) (short) 10, 10, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (short) 10, (int) (short) 10, (int) (byte) 100, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 10, (int) (short) 10, 1, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) -1, (int) (byte) 1, (int) (byte) 100, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(1, 10, (int) (byte) 0, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 0, 0, (int) (short) 0, (int) (byte) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', 100, (int) (short) -1, (int) (short) 1, (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) -1, (int) (short) 0, (int) (short) 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) '#', (int) 'a', (int) (byte) 1, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) 100, (int) (byte) 10, 0, true);
        java.lang.Class<?> wildcardClass78 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 1, (int) '#', (int) '#', 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 0, (int) (byte) -1, 10, (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) 100, 0, (int) (byte) 100, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 0, (int) 'a', 1, false);
        java.lang.Class<?> wildcardClass29 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(10, (int) (byte) 1, (int) (byte) 100, (int) (byte) 0, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 100, (int) ' ', 0, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 1, 1, 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) ' ', 10, (-1), 0, 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 1, 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', 1, (int) '#', 0, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1, (-1), false);
        java.lang.Class<?> wildcardClass71 = matchResult70.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), 0, (int) (byte) 100, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '#', 10, (int) (byte) -1, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 0, (int) (short) 0, (int) (byte) 10, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass57 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 1, 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', 1, (int) '#', 0, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1, (-1), false);
        java.lang.Class<?> wildcardClass71 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (short) 10, (int) '#', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) -1, (-1), (int) (short) 10, true);
        java.lang.Class<?> wildcardClass29 = matchResult28.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) '#', (int) (short) 1, (-1), (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) '#', 100, (int) (short) 0, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 1, (int) (short) 10, 10, (int) '4', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, 0, (int) 'a', (int) (short) 1, (int) (short) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(0, (int) 'a', (int) '4', (int) (byte) 1, (int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) 10, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (byte) 1, 100, 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) '#', 1, (int) (short) -1, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 0, (int) (short) 0, (int) ' ', 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 10, (int) (byte) 10, (int) '4', (int) (byte) -1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (int) (byte) 0, (int) (short) 0, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) 'a', (int) '#', (int) (short) -1, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((-1), (int) '#', 0, (int) 'a', 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 100, (int) (byte) 100, 1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '#', (int) (short) -1, (int) (byte) 1, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '4', (int) (byte) 1, (int) (short) 0, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 100, (int) '4', 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(10, 0, (int) '#', (int) '4', 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (int) (byte) 0, (int) (short) 0, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) 'a', (int) '#', (int) (short) -1, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) (short) 1, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '#', 1, (int) ' ', (int) '#', 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) -1, (int) (short) 10, (-1), (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', 10, (int) (byte) -1, (int) (byte) 1, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) 1, (-1), 1, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 0, (int) (short) 1, (int) (byte) -1, 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 1, (int) '4', (int) (byte) 0, (int) '#', true);
        java.lang.Class<?> wildcardClass15 = matchResult14.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 0, (int) (byte) 1, (int) (short) 0, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) '#', (int) (short) 1, (int) (byte) -1, (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 10, (int) (short) 0, (int) (byte) 100, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) -1, (int) (byte) -1, (int) ' ', (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 1, (int) ' ', (int) ' ', (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 10, (int) '4', (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(0, (int) (short) -1, (-1), (int) (byte) -1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult91 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 10, 0, (int) (short) -1, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult98 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) -1, (int) (byte) 100, (int) (short) 100, 100, false);
        java.lang.Class<?> wildcardClass99 = matchResult98.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult91 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult91.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult98 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult98.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) ' ', (int) (short) 1, (int) (short) -1, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 10, (int) (byte) 1, 0, (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) ' ', (int) '4', (int) (byte) 10, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 1, (int) (byte) 1, (int) ' ', (int) 'a', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(1, 10, (int) (byte) 0, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 0, 0, (int) (short) 0, (int) (byte) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((-1), (int) '#', (int) (byte) 1, (int) (short) 10, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '#', (int) (short) -1, (int) (short) 10, (int) (byte) 100, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) -1, 10, (int) (short) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) 'a', (int) (short) -1, 0, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', (int) (short) 1, (int) (byte) 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (-1), (int) (short) 10, (int) (short) 1, (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (-1), (int) (short) 1, (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) -1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (int) ' ', (int) '4', (int) (byte) 1, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) -1, (int) '#', (int) (byte) 10, (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 0, (int) (short) 0, (int) (byte) -1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 10, 100, (int) '#', (int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (-1), 10, (-1), (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 1, 1, (int) (short) 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', (int) (short) 100, (int) '4', (int) (short) -1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 0, (int) (byte) 100, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 0, (int) (byte) -1, (int) (byte) -1, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(1, 0, 0, 10, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 0, 0, (int) (byte) 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (-1), 0, (int) '#', (int) 'a', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', 100, 0, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 0, (int) (short) 1, (int) '#', (int) (short) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 100, (-1), (int) '#', (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (-1), 1, (int) (byte) 10, (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 100, (int) (short) 1, (int) (short) 100, (int) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) 10, (int) (byte) 1, (int) (short) 1, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 1, 1, (int) '#', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (byte) 0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass22 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (-1), 10, (-1), (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 1, 1, (int) (short) 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) 10, (int) (short) 0, (int) ' ', (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(100, 0, (int) (byte) 100, (int) (byte) -1, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass85 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 10, 10, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (int) (byte) 1, (int) (short) 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '#', 0, (int) '#', (int) ' ', (int) 'a', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 10, (int) '#', (int) (byte) -1, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (-1), 0, (int) (short) 0, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '4', (int) (byte) 1, (int) (byte) 10, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (short) 100, 0, (int) (byte) -1, 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) -1, 10, (int) (short) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) '#', (int) ' ', (int) (byte) 0, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 100, (-1), (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (-1), (int) ' ', 100, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (byte) -1, (int) 'a', (int) (byte) 100, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) 100, 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (-1), (int) (short) 1, (int) 'a', (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (int) '#', (int) '4', 0, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 1, (int) (byte) 0, (int) ' ', 0, true);
        java.lang.Class<?> wildcardClass71 = matchResult70.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 1, (int) (short) 10, (int) '#', 0, true);
        java.lang.Class<?> wildcardClass36 = matchResult35.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, 100, (int) (short) 1, (int) (byte) -1, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (byte) 0, (int) (short) 100, 10, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 10, (int) (byte) 1, (int) (byte) 100, 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 10, 100, (int) '4', (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) ' ', (int) ' ', (int) (byte) 0, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 1, 0, (int) (byte) 0, (int) (byte) 0, true);
        java.lang.Class<?> wildcardClass57 = matchResult56.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) '#', (int) (short) 1, (-1), (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(10, (-1), (int) (short) 1, (-1), (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 1, (int) (byte) 0, (int) (short) 10, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 0, (int) 'a', (int) (byte) -1, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, 100, (int) '4', (int) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 0, (int) (short) 100, (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) '#', (int) ' ', 10, 0, (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(1, 0, (int) (byte) 1, 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(1, 1, (int) ' ', (-1), (int) 'a', true);
        java.lang.Class<?> wildcardClass85 = matchResult84.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (short) 10, (int) '#', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (-1), 10, 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) 100, 100, (int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '4', 1, 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 10, (int) (byte) 1, 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 0, 100, (int) '#', 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 100, (int) (byte) 100, 1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '#', (int) (short) -1, (int) (byte) 1, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 0, (int) (short) 1, 1, (int) (short) -1, true);
        java.lang.Class<?> wildcardClass71 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 10, (int) (short) -1, 10, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(1, 0, (int) (short) -1, (int) (short) 100, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) -1, 0, (int) '4', (int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '4', (int) (short) -1, 100, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 1, (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, (int) '4', (int) (byte) 1, 10, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, 10, (int) (short) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) ' ', 0, (int) (byte) 100, (int) 'a', false);
        java.lang.Class<?> wildcardClass57 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, 10, 0, (int) 'a', 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 10, (int) (byte) 0, 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 0, (int) (byte) -1, (int) (byte) 1, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, 0, (int) 'a', (-1), (int) '4', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 0, (int) (byte) 10, (-1), (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (-1), (int) '#', 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) ' ', (int) (byte) -1, 10, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 10, 1, 0, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass78 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) ' ', (int) (byte) 10, (int) (byte) 0, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) -1, (int) (short) 100, (int) (short) 10, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) -1, 10, (int) (short) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) 'a', (int) (short) -1, 0, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', (int) (short) 1, (int) (byte) 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 1, (int) (byte) 1, (int) (short) 10, (int) (byte) 0, true);
        java.lang.Class<?> wildcardClass43 = matchResult42.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(10, (int) '4', 0, 10, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(10, (int) (short) -1, 100, (int) '4', (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 100, (int) (short) 1, (int) (short) 1, (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 10, (int) (byte) 0, (int) (byte) -1, (int) '#', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 0, (int) (byte) 10, (-1), (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 10, 0, 1, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(100, (int) 'a', (int) ' ', (int) (byte) -1, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, 0, (int) (byte) 10, (int) (short) 100, (int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 1, (int) ' ', (-1), 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 0, (int) ' ', (int) '#', (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) 0, (int) (short) 100, (int) '#', (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (-1), (int) (byte) -1, (-1), (int) (short) -1, false);
        java.lang.Class<?> wildcardClass57 = matchResult56.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', 1, 10, 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) ' ', (-1), (int) (short) -1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) ' ', 100, (int) (byte) 0, 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) '#', (int) (short) 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, 0, 1, (int) (short) 1, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (byte) 0, (int) (short) 0, (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, (int) (byte) 100, (int) '4', (int) ' ', (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 0, (int) (byte) -1, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) 10, (int) '4', (int) 'a', (int) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 0, (int) (byte) 1, (int) (short) 0, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) '#', (int) (short) 1, (int) (byte) -1, (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 10, (int) (short) 0, (int) (byte) 100, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) ' ', (int) '4', (int) ' ', 100, true);
        java.lang.Class<?> wildcardClass57 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 100, 1, 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 100, (int) (byte) 100, (int) (short) 10, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(100, (int) 'a', 1, 0, (int) (short) 0, false);
        java.lang.Class<?> wildcardClass71 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 100, (int) (short) 100, (int) (short) -1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) (short) -1, (int) (byte) 10, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (short) -1, (int) (byte) 100, (int) (short) 1, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) ' ', 10, (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) 0, (int) (byte) 1, 10, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 0, (int) (byte) 1, 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) -1, (int) '#', 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate(10, 10, (-1), 1, (int) (short) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) -1, (int) 'a', (int) (short) -1, (int) (byte) -1, true);
        java.lang.Class<?> wildcardClass85 = matchResult84.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 10, (int) (byte) 0, 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) ' ', (-1), (-1), (int) '#', (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 1, (-1), 0, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (short) 100, (int) (byte) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 1, (int) (short) 10, (int) '#', 0, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 10, 0, (int) (byte) 0, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(10, 1, (int) '4', (int) (byte) -1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 0, (-1), 1, (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass15 = matchResult14.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (int) '4', (int) (byte) -1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, 100, (int) (short) 1, (int) (byte) -1, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 0, (int) (byte) -1, (int) (byte) -1, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 1, (int) 'a', 0, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate((int) '#', (-1), (int) (byte) 100, (int) '4', 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) 'a', 0, (int) (short) -1, (int) (short) 1, 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) 'a', (int) (byte) 1, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(100, (int) '#', (int) (byte) 10, 0, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass36 = matchResult35.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 0, (int) 'a', 1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 100, 10, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 100, (int) '4', (int) ' ', (int) (short) 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 1, (int) '#', (int) '#', 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 0, (int) (byte) -1, 10, (int) (short) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (byte) -1, 10, 0, (int) (short) 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (-1), 10, (-1), (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) 1, 1, (int) (short) 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (short) 100, (-1), (-1), (int) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 0, (int) (byte) 100, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 0, (int) (byte) -1, (int) (byte) -1, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(1, 0, 0, 10, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 0, 0, (int) (byte) 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '4', 10, (int) (short) 0, 0, (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (short) 10, (int) 'a', 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) -1, 10, (int) (short) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) 'a', (int) (short) -1, 0, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) '4', (int) (short) 1, (int) (byte) 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (short) 10, (int) (short) 0, (int) 'a', 100, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) ' ', (int) (short) 100, (int) (byte) 0, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '#', 10, (-1), 100, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 1, (int) '#', (int) (byte) 100, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 0, 100, 0, (int) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) -1, (int) (byte) -1, (int) ' ', (int) '#', false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) 1, (int) ' ', (int) ' ', (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) ' ', (int) ' ', (int) (byte) 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 0, 1, (int) (short) 10, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(10, 0, (int) (byte) -1, 10, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass85 = matchResult84.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '4', 1, 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (byte) 100, (int) (short) 1, (int) (short) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (byte) 100, (int) (byte) 1, (int) (short) 10, (int) (short) -1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 100, 100, (int) 'a', 1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (byte) 0, (int) (short) 10, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 0, (-1), (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) ' ', (-1), (int) ' ', (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 100, 0, (int) (short) 100, (int) (short) 10, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) '#', (int) 'a', (int) '4', (int) (byte) -1, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) '4', (int) (short) -1, (int) (byte) 100, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 0, (-1), (int) (byte) 1, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 100, 0, (int) (byte) 10, (int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) -1, 100, (int) (short) 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (-1), 1, (int) ' ', (int) (short) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (-1), 10, (-1), (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 0, (int) (short) 0, (-1), 0, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) 1, 1, (int) (short) 1, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate((int) '#', (int) ' ', 100, (int) '4', (int) ' ', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) 100, (int) (short) 100, (int) (short) -1, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) (short) -1, (int) (byte) 10, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (short) -1, (int) (byte) 100, (int) (short) 1, 10, true);
        java.lang.Class<?> wildcardClass43 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 100, 100, (int) 'a', 1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) (short) 0, (int) '4', (int) (short) -1, (-1), true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 1, (int) (short) 10, 0, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 10, (int) 'a', false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 1, (int) ' ', (-1), 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 0, (int) ' ', (int) '#', (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) 0, (int) (short) 100, (int) '#', (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(10, (int) (short) -1, (int) ' ', (int) ' ', (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', 0, (int) (byte) 0, (-1), 0, true);
        java.lang.Class<?> wildcardClass64 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 1, (int) (byte) 0, (int) (short) 100, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass29 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 0, (int) (byte) 10, (-1), (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (-1), (int) '#', 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) ' ', 0, (int) (short) 0, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) -1, (int) (short) 1, 100, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(0, (-1), (int) (short) 10, (int) (short) 1, 10, true);
        java.lang.Class<?> wildcardClass85 = matchResult84.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) -1, (int) '4', (int) '4', (int) (byte) 10, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) (byte) -1, (int) '#', (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, (int) (byte) 100, (-1), true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(10, (int) (byte) 1, (int) (byte) 1, (int) (byte) -1, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) 'a', (int) (short) 100, (int) (short) -1, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) (short) 1, (int) (byte) -1, (int) ' ', (int) (short) -1, false);
        java.lang.Class<?> wildcardClass57 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (short) -1, (int) '4', (int) (short) 1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 0, (int) '4', (int) (short) 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) '4', 1, 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, (-1), (int) (byte) 10, 100, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) -1, (int) 'a', 0, (int) (short) 0, false);
        java.lang.Class<?> wildcardClass71 = matchResult70.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(10, (int) (short) 0, 100, 100, (int) (short) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) -1, 0, (-1), (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(10, (int) 'a', 100, (int) ' ', (int) ' ', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) '#', (int) (short) 1, (-1), (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(10, (-1), (int) (short) 1, (-1), (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) 0, 0, (int) (short) 10, 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 0, (int) (byte) 100, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, 100, 0, (int) (short) -1, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 1, 10, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (short) 10, (int) '#', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) -1, (-1), (int) (short) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) ' ', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 1, 100, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 10, (int) 'a', (int) ' ', (-1), false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(100, (int) (byte) 0, (int) (byte) 1, (int) (short) 0, (int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) '4', (int) (short) 100, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (short) 0, (int) (byte) 100, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), 0, (int) (short) 1, (int) (short) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 1, (int) 'a', (int) 'a', (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (byte) 10, (int) (byte) 0, 1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 10, (int) (byte) 1, (int) '4', (int) (byte) 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) '4', (int) (short) -1, (int) (byte) 100, (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) -1, 0, (-1), (int) (byte) 1, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (byte) 1, 1, 1, (int) '#', true);
        java.lang.Class<?> wildcardClass36 = matchResult35.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (short) 10, (int) (short) 0, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) 'a', (int) (byte) 1, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(100, (int) '#', (int) (byte) 10, 0, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 0, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) '#', (int) (byte) 10, 10, 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) '4', 10, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 100, (int) (short) -1, 100, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 10, 100, 0, (int) (byte) -1, (int) 'a', false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 1, (int) (byte) 0, (int) 'a', (int) '4', true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(0, 0, (int) (byte) 0, (int) '4', (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 100, 0, 100, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass71 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) (byte) 0, (int) (byte) 100, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) 0, (int) (byte) -1, (int) (byte) -1, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(1, 0, 0, 10, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 10, 0, (int) (short) -1, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 1, (int) (byte) -1, (-1), (-1), true);
        java.lang.Class<?> wildcardClass50 = matchResult49.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, 10, (int) '#', (int) (short) 100, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) ' ', (int) '#', (int) (short) 0, (int) 'a', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (-1), (-1), (int) (short) 1, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 10, (int) (byte) 10, (int) 'a', (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (byte) 10, 10, (int) (short) 10, (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(10, (int) (byte) 10, 10, 1, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 10, (int) (short) 10, 1, 0, (int) '4', true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (short) 0, 10, (-1), 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(10, 100, 0, (int) (byte) 100, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) ' ', (int) (short) 10, 10, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (byte) -1, (int) (byte) 0, 100, (int) (short) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) (short) -1, (int) '#', (int) (byte) 100, 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (short) 10, 1, (int) ' ', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 0, (int) (byte) 1, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '4', (int) (short) -1, 100, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 1, (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (byte) 100, (int) (byte) 10, (int) '4', (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) (short) 0, 0, (int) '#', 0, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(1, (int) 'a', (-1), (int) (short) 1, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) 1, 0, (int) (byte) 10, 1, false);
        java.lang.Class<?> wildcardClass64 = matchResult63.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 1, 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 100, (int) 'a', (int) (short) 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(1, 0, (int) '#', 100, (int) (byte) -1, false);
        java.lang.Class<?> wildcardClass71 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) ' ', (int) ' ', (int) '4', (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate(100, (int) '4', (-1), (int) (byte) -1, (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 10, (int) (short) 0, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) -1, (int) '4', (int) ' ', 1, true);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 1, (int) (short) 1, 0, (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(0, 0, 1, (-1), (int) (short) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) ' ', (int) (short) 100, (int) (byte) 1, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) ' ', 100, (int) '4', (int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(100, 10, (int) (byte) 1, 0, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, (int) '#', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) 'a', (int) (short) 100, 0, 10, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(100, 0, 0, (int) 'a', (int) (byte) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 10, (int) (byte) 1, 100, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(1, 100, (int) 'a', (int) (short) 0, 0, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 10, 0, 0, (int) (byte) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) ' ', (int) (short) 100, (int) 'a', (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (byte) 1, (int) (short) 100, (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) '#', (int) '#', 10, (-1), 100, false);
        java.lang.Class<?> wildcardClass29 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) '#', (int) '4', (int) (short) 100, 1, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (short) 0, (int) (byte) 100, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), 0, (int) (short) 1, (int) (short) 100, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 1, (int) 'a', (int) 'a', (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (byte) 10, (int) (byte) 0, 1, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) (short) -1, 1, (int) (byte) 1, (int) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate(1, (int) (byte) -1, (int) (short) 10, (int) '#', (int) (byte) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, (int) (byte) -1, (-1), (int) (short) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) ' ', 0, (int) (short) 100, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 1, 100, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) ' ', (int) 'a', (int) (byte) -1, 0, 1, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) 'a', 1, (int) (short) 10, (int) (short) 1, (int) (byte) 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (byte) -1, (-1), (int) (short) 0, (int) (byte) -1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (-1), (int) (short) 1, (int) ' ', 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) (byte) -1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (int) ' ', (int) '4', (int) (byte) 1, (int) (byte) 100, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) '#', 10, (int) (short) 100, (int) (byte) 10, 100, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.STRONG_MATCH + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.STRONG_MATCH));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, 100, (int) '#', 100, (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) '#', (int) (short) 1, (int) ' ', (-1), 0, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate(0, (int) (byte) 0, (int) ' ', (int) '#', (int) (byte) 1, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate(0, (int) 'a', (int) '4', (int) (short) 100, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass50 = candidateMatchingService0.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 10, (int) (byte) 0, 100, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, 100, 100, (int) 'a', 1, true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate(0, (int) '4', (int) (byte) 0, (int) (short) 10, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 1, (int) (short) 0, (int) (byte) 0, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) 'a', (int) (short) 10, 100, 0, (int) (short) 0, true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 1, (int) (short) 100, (int) (short) 0, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, 1, 0, 1, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (byte) 0, 100, (int) (short) -1, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate(0, (int) ' ', 1, 10, (int) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_SKILLS));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) 'a', (int) '4', (int) '4', (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) (byte) 0, (int) (byte) 100, (int) (short) -1, 1, (int) ' ', false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((-1), (int) (short) -1, 10, (int) (short) 100, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) -1, (int) '#', (int) ' ', (int) (byte) 0, (int) ' ', true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate((int) (byte) 1, 0, (int) (short) 100, (-1), (int) (byte) -1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) '4', (-1), (int) ' ', 100, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass43 = matchResult42.getClass();
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INSUFFICIENT_EXPERIENCE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        edu.example.jobsportal.service.CandidateMatchingService candidateMatchingService0 = new edu.example.jobsportal.service.CandidateMatchingService();
        edu.example.jobsportal.model.MatchResult matchResult7 = candidateMatchingService0.evaluateCandidate((int) '4', 0, (int) 'a', (int) (byte) 10, (int) '4', false);
        edu.example.jobsportal.model.MatchResult matchResult14 = candidateMatchingService0.evaluateCandidate((int) '4', 1, 1, 0, 0, false);
        edu.example.jobsportal.model.MatchResult matchResult21 = candidateMatchingService0.evaluateCandidate((int) (short) 1, 0, (int) (short) 10, (int) (byte) 10, (int) 'a', true);
        edu.example.jobsportal.model.MatchResult matchResult28 = candidateMatchingService0.evaluateCandidate((int) (byte) 10, (int) ' ', (int) (byte) 10, 100, 100, true);
        edu.example.jobsportal.model.MatchResult matchResult35 = candidateMatchingService0.evaluateCandidate(0, (int) (short) 100, 0, (int) (short) 0, (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult42 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (byte) 100, (int) (byte) 10, (-1), (int) '#', true);
        edu.example.jobsportal.model.MatchResult matchResult49 = candidateMatchingService0.evaluateCandidate((int) (byte) 100, (int) (byte) 0, (int) ' ', (int) (short) 0, (int) (short) 100, false);
        edu.example.jobsportal.model.MatchResult matchResult56 = candidateMatchingService0.evaluateCandidate((int) (short) 100, (int) (short) 0, (int) (byte) 10, (-1), (int) (short) 1, false);
        edu.example.jobsportal.model.MatchResult matchResult63 = candidateMatchingService0.evaluateCandidate(100, (-1), (int) '#', 0, (int) (byte) 10, true);
        edu.example.jobsportal.model.MatchResult matchResult70 = candidateMatchingService0.evaluateCandidate((int) (short) 0, (int) ' ', 0, (int) (short) 0, (int) (byte) 10, false);
        edu.example.jobsportal.model.MatchResult matchResult77 = candidateMatchingService0.evaluateCandidate((int) (short) 1, (int) (short) -1, (int) (short) 1, 100, 100, false);
        edu.example.jobsportal.model.MatchResult matchResult84 = candidateMatchingService0.evaluateCandidate(0, (-1), (int) (short) 10, (int) (short) 1, 10, true);
        edu.example.jobsportal.model.MatchResult matchResult91 = candidateMatchingService0.evaluateCandidate((int) '4', (int) (short) 0, (-1), (int) '#', (int) (short) 100, true);
        org.junit.Assert.assertTrue("'" + matchResult7 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult7.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult14 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult14.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult21 + "' != '" + edu.example.jobsportal.model.MatchResult.ELIGIBLE + "'", matchResult21.equals(edu.example.jobsportal.model.MatchResult.ELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult28 + "' != '" + edu.example.jobsportal.model.MatchResult.POTENTIAL + "'", matchResult28.equals(edu.example.jobsportal.model.MatchResult.POTENTIAL));
        org.junit.Assert.assertTrue("'" + matchResult35 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult35.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult42 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult42.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult49 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult49.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult56 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult56.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult63 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult63.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult70 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult70.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult77 + "' != '" + edu.example.jobsportal.model.MatchResult.INELIGIBLE + "'", matchResult77.equals(edu.example.jobsportal.model.MatchResult.INELIGIBLE));
        org.junit.Assert.assertTrue("'" + matchResult84 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult84.equals(edu.example.jobsportal.model.MatchResult.INVALID));
        org.junit.Assert.assertTrue("'" + matchResult91 + "' != '" + edu.example.jobsportal.model.MatchResult.INVALID + "'", matchResult91.equals(edu.example.jobsportal.model.MatchResult.INVALID));
    }
}

