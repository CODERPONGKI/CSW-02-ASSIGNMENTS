//Implement a custom NullPointerException class named CustomNullPointerException that 
//mimics the behavior of the standard NullPointerException, but instead of using
//default error messages or null references, it takes a String message as its constructor argument. 
//Your task is to create this custom
//exception class and demonstrate its usage in a Java program.

import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;

    // Constructor
    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    // Overloaded compareTo method
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rn, other.rn);
    }

    // Overloaded toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rn + ", Total Mark: " + totalMark;
    }
}
public class ass03q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Student[] students = {
            new Student("saira", 1, 85),
            new Student("swarna", 2, 90),
            new Student("aslesha", 3, 78)
        };

        // Linear search for student with roll number 2
        int targetRn = 2;
        for (Student student : students) {
            if (student.getRn() == targetRn) {
                System.out.println("Student found: " + student);
                break;
            }
        }
    }
}

