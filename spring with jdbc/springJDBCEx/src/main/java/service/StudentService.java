package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import module.Student;
import repo.StudentRepo;

@Service  // Marks this class as a Spring bean of type 'service.StudentService'.
public class StudentService {
    
    private StudentRepo repo;  // Declare the dependency on the StudentRepo.

    @Autowired  // Tells Spring to automatically inject the StudentRepo bean into this field.
    public void setRepo(StudentRepo repo) {
        this.repo = repo;  // This setter is called by Spring to inject the 'StudentRepo' bean.
    }

    // Adds a student to the repository using StudentRepo.
    public void addStudents(Student s) {
        repo.save(s);  // Calls 'save' method in 'StudentRepo' to store the student.
    }

    // Retrieves all students from the repository.
    public List<Student> getStudents() {        
        return repo.findAll();  // Calls 'findAll' method in 'StudentRepo' to fetch the list of students.
    }
}
