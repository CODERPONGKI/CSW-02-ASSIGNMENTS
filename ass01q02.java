 //Design a Java class called Rectangle with private attributes length and width. 
 //Include a constructor to initialize these attributes, as well as setter and getter 
//methods for each attribute. Additionally, implement methods to calculate the area and 
//perimeter of the rectangle. Write a main method to create an object of the Rectangle class, 
//set values for its attributes, and display the area and perimeter.
// Rectangle.java
public class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize attributes here
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setter for length of rectangle
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for length of rectangle
    public double getLength() {
        return length;
    }

    // Setter method for width of rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method for width of rectangle
    public double getWidth() {
        return width;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
public class ass01q02{
    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle(5, 3);

        // Set values for attributes
        rect.setLength(7);
        rect.setWidth(4);

        // Display the area and perimeter of rectangle
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
