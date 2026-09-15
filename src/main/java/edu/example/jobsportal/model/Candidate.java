package edu.example.jobsportal.model;

import java.util.*;

public class Candidate {
    private final long id;
    private final String name;
    private final String email;
    private final Set<String> skills;

    public Candidate(long id, String name, String email, Set<String> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = new HashSet<>(skills);
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Set<String> getSkills() { return Collections.unmodifiableSet(skills); }
}
