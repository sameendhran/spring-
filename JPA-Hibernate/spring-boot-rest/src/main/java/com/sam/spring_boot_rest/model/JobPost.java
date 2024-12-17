package com.sam.spring_boot_rest.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobPost {

    @Id
    private int postId;

    @Column(name = "post_profile")
    private String postProfile;

    @Column(name = "post_desc")
    private String postDesc;

    private int experience;

    @ElementCollection
    private List<String> skills;

    // Constructor
    public JobPost(int postId, String postProfile, String postDesc, int experience, List<String> skills) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.experience = experience;
        this.skills = skills;
    }

    // Default constructor (required by JPA)
    public JobPost() {
    }

    // Getters and Setters
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
