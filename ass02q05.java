
//Write a program to create a Student class with members name, rn, and
//total mark. Create an array of student objects and sort it using Bubble
//sort according to its rn.
//import java.util.Arrays;

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
public class ass02q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

        Student[] students = {
            new Student("saira", 3, 85),
            new Student("swarna", 1, 90),
            new Student("aslesha", 2, 78)
        };

        // Bubble sort
        for (int i = 0; i < studentsss.length - 1; i++) {
            for (int j = 0; j < studentssss.length - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display sorted students
        System.out.println("Sorted students:");
        for (Student student : studentsss) {
            System.out.println(student);
        }
    }
}

