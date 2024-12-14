package model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    // No-argument constructor
    public JobPost() {
    }

    // All-argument constructor
    public JobPost(int postId, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    // Getter and Setter for postId
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    // Getter and Setter for postProfile
    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    // Getter and Setter for postDesc
    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    // Getter and Setter for reqExperience
    public Integer getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(Integer reqExperience) {
        this.reqExperience = reqExperience;
    }

    // Getter and Setter for postTechStack
    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }
    
//    @Override
//    public String toString() {
//        return "JobPost {" +
//                "postId=" + postId +
//                ", postProfile='" + postProfile + '\'' +
//                ", postDesc='" + postDesc + '\'' +
//                ", reqExperience=" + reqExperience +
//                ", postTechStack=" + postTechStack +
//                '}';
//    }
}
