//Implement a Java program that reads a file path from the command 
//line argument and attempts to read the contents of the file. If the file path is null 
//or points to a non-existent file, throw a custom FileNotFoundException. If the file exists but 
//cannot be read due to permission issues, throw a custom FileReadPermissionException. 
//Your task is to create these custom 
//exception classes and handle them appropriately in your program.

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
        return "Name-:> " + name + ", Roll Number-:> " + rn + ", Total Mark->: " + totalMark;
    }
}

public class ass03q05 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("saira", 1, 85),
            new Student("swarna", 2, 90),
            new Student("ashlesha", 3, 78)
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
