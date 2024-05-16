//Write a program to create a Student class that has members, name, roll
//number, and age. Design the Student class in such a way that it can take
//the roll number as an integer or string. Create a driver class that creates
//student objects and invokes the methods.
package assignment02;


class Student {
    private String name;
    private String rollNumber;
    private int age;

    // Constructor
    public Student(String name, String rollNumber, int age) {
        this.name =      name;
        this.rollNumber =          rollNumber;
        this.age =      age;
    }

    public Student(String name, int rollNumber, int age) {
        this.name =     name;
        this.rollNumber = String.valueOf(rollNumber);
        this.age =       age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    // Overloaded toString method
    @Override
    public String toString() {
        return "Name-:>  " + name + ", Roll Number-:>   " + rollNumber + ", Age-:> " + age;
    }
}

public class ass02q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Student student001 = new Student("SAIRA", "S101", 20);
        Student student002 = new Student("SWARNA", 102, 21);

        System.out.println(student001);
        System.out.println(student002);
    }
}
