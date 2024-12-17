package com.sam.spring_boot_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sam.spring_boot_rest.model.JobPost;
import com.sam.spring_boot_rest.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("JobPosts")
    public List<JobPost> getAllJobs() {
        return service.returnAllJobPosts();
    }

    @GetMapping("JobPost/{id}")
    public JobPost getJobs(@PathVariable int id) {
        return service.getJobs(id);
    }

    @PostMapping("JobPost")
    public JobPost addJobPost(@RequestBody JobPost job) {
        service.addJobPost(job);
        return service.getJobs(job.getPostId());
    }

    @PutMapping("JobPost")
    public JobPost updateJobPost(@RequestBody JobPost job) {
        service.updateJobPost(job);
        return service.getJobs(job.getPostId());
    }

    @DeleteMapping("JobPost/{id}")
    public String deleteJobPost(@PathVariable int id) {
        service.deleteJobPost(id);
        return "deleted";
    }

    @GetMapping("JobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return service.search(keyword);
    }
}
