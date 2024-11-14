package basics.uml.association;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private List<Course> courses;

    // Constructor
    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);  // Add this student to the course's student list
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        // Avoiding recursive call to Course.toString()
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", courses=" + courses.size() +  // Showing the number of courses instead of their details
                '}';
    }

    public static void main(String[] args) {
        // Create some courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Create a student
        Student student = new Student("Alice");

        // Enroll the student in courses
        student.enrollCourse(math);
        student.enrollCourse(science);

        // Display student and course details
        System.out.println(student);
        System.out.println(math);
        System.out.println(science);
        System.out.println(math.getStudents());
    }
}

