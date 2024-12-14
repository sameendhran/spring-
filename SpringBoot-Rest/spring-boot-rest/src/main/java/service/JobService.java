package service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.JobPost;
import repo.JobRepo;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.returnAllJobPosts();

	}

	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}


	public JobPost getJobs(int postId) {
		// TODO Auto-generated method stub
		return repo.getJobs(postId);
	}


	public void updateJobPost(JobPost job) {
		repo.updateJobPost(job);
		
	}


	public void deleteJobPost(int id) {
		repo.deleteJobPost(id);
		
	}

	
}
