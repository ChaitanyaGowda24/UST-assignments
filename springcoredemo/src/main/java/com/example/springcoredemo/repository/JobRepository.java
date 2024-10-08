package com.example.springcoredemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springcoredemo.model.JobNotification;

@Repository
public interface JobRepository extends JpaRepository<JobNotification, Long>{

}
