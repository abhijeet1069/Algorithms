package basics.uml.association;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        // Avoiding recursive call to Student.toString()
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students.size() +  // Showing the number of students instead of their details
                '}';
    }
}


