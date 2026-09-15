package edu.example.jobsportal.model;

public class Employer {
    private final long id;
    private final String companyName;
    private final String email;

    public Employer(long id, String companyName, String email) {
        this.id = id;
        this.companyName = companyName;
        this.email = email;
    }

    public long getId() { return id; }
    public String getCompanyName() { return companyName; }
    public String getEmail() { return email; }
}
