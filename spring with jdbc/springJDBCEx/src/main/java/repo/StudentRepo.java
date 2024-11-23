package repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import module.Student;

@Repository
public class StudentRepo {
    @Autowired
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    // Insert Method
    public void save(Student s) {
    	  String sql = "DELETE FROM student WHERE rollno = ?";
          int rowsAffected = jdbc.update(sql,104);
        //String sql = "insert into student (rollno, name, marks) values (?, ?, ?)";
        //int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        //System.out.println(rows + " row(s) inserted.");
    }

    // Update Method
    public void update(int rollNo, String name) {
       // String sql = "update student set name = ? where rollno = ?";
//        int rows = jdbc.update(sql, name, rollNo);
//        System.out.println(rows + " row(s) updated.");
    }

 // Method to retrieve all students from the 'student' table
    public List<Student> findAll() {
        // SQL query to select all records from the 'student' table
        String sql = "select * from student";

        // RowMapper is an interface that maps each row of the ResultSet to a Java object (Student in this case).
        // We define the logic of how to map each row inside this lambda expression.
        RowMapper<Student> mapper = (rs, rowNum) -> {
            // 'rs' is the ResultSet which holds the results of the SQL query and it work one by one row on sql table 
            // 'rowNum' is the row number being processed, but it’s not used here.

            // Create a new instance of Student to map the result to
            Student s = new Student();

            // Mapping columns from the ResultSet to the Student object
            s.setRollNo(rs.getInt("rollno"));  
            s.setName(rs.getString("name"));   
            s.setMarks(rs.getInt("marks"));    

            // Return the populated Student object
            return s;
        };

        // Execute the query and return the list of Student objects
        // 'jdbc.query()' executes the SQL query, mapping each row in the ResultSet to a Student object using the RowMapper
        return jdbc.query(sql, mapper);
    }
}
