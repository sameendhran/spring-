package com.example.springJDBCEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import module.Student;
import repo.StudentRepo;
import service.StudentService;

@SpringBootApplication  // This annotation indicates the main entry point for Spring Boot application.
@ComponentScan({"com.example.springJDBCEx", "module", "service", "repo"})  // Tells Spring to scan these packages for Spring Beans (components).
public class SpringJdbcExApplication {

	@Autowired
	StudentRepo repo;
    public static void main(String[] args) {
        // Spring Boot initializes the application context by running SpringApplication.run.
        ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
        
        // Spring Boot automatically creates a 'Student' bean because of the @Component annotation.
        // 'context.getBean(Student.class)' fetches that instance from the Spring container.
        Student s = context.getBean(Student.class);
        
        // Setting values for the Student bean properties.
        s.setRollNo(104);
        s.setName("sam");
        s.setMarks(80);
        
        // Spring Boot also manages the 'StudentService' bean which was annotated with @Service.
        // The 'context.getBean(StudentService.class)' fetches this instance from the Spring container.
        StudentService service = context.getBean(StudentService.class);
        
        // Call to add the student to the repository through StudentService.
        service.addStudents(s);
        
        List<Student> students=service.getStudents();
        students.forEach(System.out::println);
       
    }
}
