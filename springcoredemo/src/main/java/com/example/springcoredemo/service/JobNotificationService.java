package com.example.springcoredemo.service;

import com.example.springcoredemo.model.JobNotification;
import com.example.springcoredemo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobNotificationService {

    private final JobRepository jobRepository;

    @Autowired
    public JobNotificationService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Method to add a new job notification
    public JobNotification addJobNotification(JobNotification jobNotification) {
        return jobRepository.save(jobNotification);
    }

    // Method to retrieve all job notifications
    public List<JobNotification> getAllJobNotifications() {
        return jobRepository.findAll();
    }

    // Method to retrieve a job notification by jobId
    public Optional<JobNotification> getJobNotificationById(Long jobId) {
        return jobRepository.findById(jobId);
    }
}
