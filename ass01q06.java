
 //Library System Assignment:
//Task: Develop a Java program for a library system incorporating encapsulation, abstraction, and inheritance.
//i. Library Resource Class:
//- Abstract class with private                   attributes for title and author.
//Constructor, getters, setters,       and an abstract method displayDetails().
//ii. Book Class:
//Subclass of Library         Resource with additional attribute pageCount.
//Constructor, getters, setters, and displayDetails()               method override.
//iii. Magazine Class:
//Subclass of Library        Resource with additional         attribute issueDate.
//Constructor, getters, setters,            and displayDetails() method override.
//iv. DVD Class:
//Subclass of 1 bra Res        urce with additional attribute duration. L
//- Constructor, etters. setters.       nd displayDetails() method override.
//v. LibrarySystem Class (Main):
//Instantiate var sources (c.g.,        Book, Magazine, DVD).
//Call display Details() for each instance to show resource information.package assignment01;

public class ass01q06 {

	public static void main(String[] args) {

abstract class LibraryResource {
    private String title;
    private String author;

    // Constructor
    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}}
