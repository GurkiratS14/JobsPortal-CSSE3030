# JobsPortal — Testing Assignment Starter Project

This is a deliberately small Java/Gradle implementation of an online JobsPortal.
It is intended to be used as a system-under-test for CSSE3030 Assignments.

The implementation is intentionally incomplete/defective in places. Students should
NOT modify production code unless instructed by the lecturer. They should develop
tests that reveal incorrect behaviour.

## Build and test

Requirements:
- Java 8

The project uses Java 8 source/target bytecode and includes the Gradle 8.14 wrapper, 
so students should run the project with ./gradlew rather than install Gradle separately.

The included test/tool versions are:

JUnit Jupiter 5.10.2
Mockito 4.11.0
JaCoCo 0.8.11


Run:
    ./gradlew test

Each test run also generates the JaCoCo reports. To regenerate them directly:
    ./gradlew jacocoTestReport

Reports are generated under:
    build/reports/jacoco/test/html/index.html
    build/reports/jacoco/test/jacocoTestReport.xml

## Q3 tool setup

- Randoop: use the supplied `randoop-all-4.3.4.jar` with Java 8. The build can
  run its generated JUnit 4 tests alongside JUnit 5 tests.
- Symbolic Pathfinder: place your driver under `src/jpf/java`, run
  `./gradlew jpfClasses` (`gradlew.bat jpfClasses` on Windows), then use the
  supplied platform launcher with your `.jpf` file.

On macOS, run `./setup-spf-macos.sh` once and use `./run-jpf-macos.sh`.
On Windows, use `./run-jpf.bat`. Follow the assignment and practical instructions
for the required analyses and commands.

## Main components

- JobService: job creation and search
- ApplicationService: job applications and status transitions
- InterviewService: interview scheduling
- CandidateMatchingService: candidate/job matching decision logic (used for Symbolic Pathfinder)
- NotificationService: external notification dependency
- Repository interfaces: useful for Mockito-based unit testing
- JobSearchFixture: fixed dataset for Q1.2 combinatorial search testing

## Important

The production implementation is provided as a testing target. Do not assume
that every behaviour is correct.

## Provide the exact commands you used to run each of the tools required for the assignment, including any necessary options or parameters. 
…