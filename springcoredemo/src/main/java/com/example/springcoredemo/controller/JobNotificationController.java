package com.example.springcoredemo.controller;

import com.example.springcoredemo.model.JobNotification;
import com.example.springcoredemo.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
public class JobNotificationController {

    private final JobNotificationService jobNotificationService;

    @Autowired
    public JobNotificationController(JobNotificationService jobNotificationService) {
        this.jobNotificationService = jobNotificationService;
    }

    // POST endpoint to create a new job notification
    @PostMapping
    public ResponseEntity<JobNotification> createJobNotification(@RequestBody JobNotification jobNotification) {
        JobNotification createdJob = jobNotificationService.addJobNotification(jobNotification);
        return ResponseEntity.ok(createdJob);
    }

    // GET endpoint to retrieve all job notifications
    @GetMapping
    public ResponseEntity<List<JobNotification>> getAllJobNotifications() {
        List<JobNotification> jobs = jobNotificationService.getAllJobNotifications();
        return ResponseEntity.ok(jobs);
    }

    // GET endpoint to retrieve a specific job notification by jobId
    @GetMapping("/{id}")
    public ResponseEntity<JobNotification> getJobNotificationById(@PathVariable Long id) {
        Optional<JobNotification> job = jobNotificationService.getJobNotificationById(id);
        return job.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
