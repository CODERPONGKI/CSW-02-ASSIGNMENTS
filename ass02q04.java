
//Write a program to create a Student class with members name, rn, and
//totalMark. Create an array of student objects and search a student object
//using linear search from the array.
//Note: Overload compareTo method of Comparable interface.package assignment02;


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
        return "Name-: " + name + ", Roll Number-:> " + rn + ", Total Mark-:> " + totalMark;
    }
}

public class ass02q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Student[] students = {
            new Student("saira", 1, 85),
            new Student("swarna", 2, 90),
            new Student("ashlesha", 3, 78)
        };

        // Linear search for student with roll number 2
        int targetRn = 2;
        for (Student student :          students) {
            if (student.getRn() == targetRn) {
                System.out.println("Studentsssssss fou nd: " + student);
                break;
            }
        }
    }
}

