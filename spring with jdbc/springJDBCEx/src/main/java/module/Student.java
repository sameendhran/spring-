package module;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // Marks this class as a Spring bean of type 'module.Student'.
@Scope("prototype")  // Tells Spring to create a new instance of this class every time it is requested (prototype scope).
public class Student {
    private int rollNo;  // Declaring student properties.
    private String name;
    private int marks;

    // Getter and setter methods for rollNo, name, and marks.

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    public int getMarks() {
        return marks;
    }

    // toString method to represent student details as a string.
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
    }
}
