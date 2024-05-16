//Design a Java program for managing student enrollment in a university, adhering to the
//principles of loose coupling and high cohesion. Your program should include classes for
//representing students (`Student`), courses (`Course`), and enrollment management
//(`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly
//through an interface class (`EnrollmentSystem`). Implement methods for enrolling and
//dropping students from courses, and displaying enrollment details. Create a `Main` class to
//demonstrate the system's functionality, with appropriate error handling and user-friendly output
//messages. Provide comments in your code explaining how loose coupling and high cohesion
//are maintained throughout the implementation.package assignment01;


public class ass01q09 {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName =            courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void dropStudent               (Student student) {
        enrolledStudents.remove(student);
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }
}
public interface EnrollmentSystem {
    void enrollStudentInCourse(Student student, Course course);
    void dropStudentFromCourse(Student student, Course course);
    void displayEnrollmentDetails(Course course);
}
public class Enrollment implements EnrollmentSystem {
    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        course.enrollStudent(student);
        System.out.println("Student " + student.getName() + " enrolled in course " + course.getCourseName() + ".");
    }

    @Override
    public void dropStudentFromCourse(Student              student, Course course) {
        course.dropStudent(student);
        System.out.println("Student "                + student.getName() + " dropped from course " + course.getCourseName() + ".");
    }

    @Override
    public void displayEnrollmentDetails(Course course) {
        System.out.println("Course-:>             " + course.getCourseName());
        System.out.println("Enrolled Students:");
        for (Student student :              course.getEnrolledStudents()) {
            System.out.println(          student);
        }
    }
}

