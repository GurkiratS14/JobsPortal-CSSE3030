package edu.example.jobsportal.service;

public interface NotificationService {
    void send(String email, String subject, String message);
}
