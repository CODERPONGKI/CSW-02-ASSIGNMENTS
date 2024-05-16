//Write a Java code snippet that comprises of a User class and an ArrayListUser class. 
//The User class should define private fields for name and age, along with a parameterized 
//constructor and getter/setter methods for these attributes. Create an ArrayListUser class 
//of User objects. After addition of objects, the ArrayListUser class should retrieve and 
//print the name and age of users. Then, it should sort the user according
//to age using getter methods and print the updated array list of users.
package assignment02;


public class User {
    private String name;
    private int age;

    // Parameterized Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Overridden toString method for displaying the User
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ass02q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        // Create an ArrayList of User objects
        ArrayList<User> users = new ArrayList<>();

        // Add User objects to the ArrayList
        users.add(new User("sairaa", 30));
        users.add(new User("swarna", 25));
        users.add(new User("aslesha", 35));

        // Retrieve and print the name and age of users
        System.out.println("Users before sorting:");
        for (User user : users) {
            System.out.println("Name-:> " + user.getName() + ", Age-:> " + user.getAge());
        }

        // Sort the users according to age using getter methods
        users.sort(Comparator.comparingInt(User::getAge));

        // Print the updated ArrayList of users
        System.out.println("\nUsers after sorting by age:");
        for (User user : users) {
            System.out.println("Name-:> " + user.getName() + ", Age-:> " + user.getAge());
        }
    }
}
