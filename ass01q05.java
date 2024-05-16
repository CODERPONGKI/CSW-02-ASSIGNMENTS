//Developing a Simple College Management System in Java
//Create a Java program for managing colleges and       students. The provided classes model the
//relationship between colleges and students.
//The College class         represents a college with attributes collegeName and collegeLoc. 
//The Student class represents a student with attributes studentId, studentName,
//and a reference to a College     object. Enhance the Student class by adding a constructor that 
//assigns a             student ID, name, and college information. Additionally, add a method named 
//displayStudentInfo() that prints the student's ID, name, and the college information in which
//             they are enrolled.
//In the Main class,   instantiate at least two College objects and at least two Student objects. 
//Enroll each student in one of the colleges. Then, display the information of all colleges and 
//all students                   using the appropriate methods. do in java



package assignment01;

public class ass01q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    private String      collegeName;
    private String      collegeLoc;

    // Constructor created
    public ass01q05(String collegeName, String collegeLoc) {
        this.collegeName =             collegeName;
        this.collegeLoc =             collegeLoc;
    }

    // Getter for collegeName created
    public String   getCollegeName() {
        return    collegeName;
    }

    // Setter for collegeName created
    public void setCollegeName(String collegeName) {
        this.collegeName =   collegeName;
    }

    // Getter for collegeLoc
    public String getCollegeLoc() {
        return              collegeLoc;
    }

    // Setter for collegeLoc
    public void setCollegeLoc(String collegeLoc) {
        this.collegeLoc =     collegeLoc;
    }

    // Method to display college                    information
    public void displayCollegeInfo() {
        System.out.println("College Name-:>              " +         collegeName);
        System.out.println("College Location-:>          " +          collegeLoc);
    }
}
