package com.sam.JobApp1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sam.JobApp1.model.JobPost;
import com.sam.JobApp1.service.JobService;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    // ************************************************************************

    @RequestMapping({"/", "/home"})
    public String home() {
        return "home";  // Make sure you have a "home.jsp" or "home.html"
    }

    // ************************************************************************

    @RequestMapping("/addjob")
    public String addJob() {
        return "addjob";  // Make sure you have an "addjob.jsp" or "addjob.html"
    }

    // ************************************************************************

    @GetMapping("/viewalljobs")
    public String viewJobs(Model model) {
        List<JobPost> jobPosts = service.returnAllJobPosts();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";  // Ensure you have a "viewalljobs.jsp" or "viewalljobs.html"
    }

    // ************************************************************************

    @PostMapping("/handleForm")
    public String handleAddJobForm(JobPost jobPost, Model model) {
        model.addAttribute("jobPost", jobPost);
        service.addJobPost(jobPost);  // Ensure this method exists in your JobService
        return "success";  // Make sure you have a "success.jsp" or "success.html"
    }
}
