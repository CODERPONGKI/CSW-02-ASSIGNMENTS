//Implement a Java program to handle NullPointerException

class Student {
    private      String name;
    private String       rollNumber;
    private int        age;

    // Constructor
    public Student(String name, String rollNumber, int age) {
        this.name =          name;
        this.rollNumber =            rollNumber;
        this.age =        age;
    }

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = String.valueOf(rollNumber);
        this.age = age;
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
        return "Name-:> " + name + ", Roll Number-:> " + rollNumber + ", Age-:> " + age;
    }
}
public class ass03q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Student student001 = new Student("saira", "S101", 20);
        Student student002 = new Student("swarna", 102, 21);

        System.out.println(student001);
        System.out.println(student002);
    }
}

