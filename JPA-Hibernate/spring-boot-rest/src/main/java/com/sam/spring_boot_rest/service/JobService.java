package com.sam.spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.spring_boot_rest.model.JobPost;
import com.sam.spring_boot_rest.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobPost> returnAllJobPosts() {
        return repo.findAll();
    }

    public void addJobPost(JobPost jobPost) {
        repo.save(jobPost);
    }

    public JobPost getJobs(int postId) {
        return repo.findById(postId).orElse(null);
    }

    public void updateJobPost(JobPost job) {
        repo.save(job);
    }

    public void deleteJobPost(int id) {
        repo.deleteById(id);
    }

    public List<JobPost> search(String keyword) {
        return repo.search(keyword);
    }
}
