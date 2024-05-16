// Write a Java program that defines a 'Point' class with attributes 
//'X' and 'Y', and includes a parameterized constructor to initialize these attributes.
//Implement a copy constructor to create a new point object with the same attribute values. 
//Ensure that modifications made to one object do not affect the other. 

//Utilize getter and setter methods to retrieve and update the attribute values.
package assignment01;


//Point.java
public class Point {
 private int x;
 private int y;

 // Parameterized constructor
 public Point(int x,  int y) {
     this.x = x;
     this.y = y;
 }

 // Copy constructor created
 public Point(Point p) {
     this.x = p.x;
     this.y = p.y;
 }

 // Getter for X method
 public int         getX( ) {
     return x;
 }

 // Setter for X method
 public void       setX(int x) {
     this.x =  x;
 }

 // Getter for Y method
 public int         getY( ) {
     return  y;
 }

 // Setter for Y method 
 public void setY(int   y) {
     this.y =  y;
 }

 // Main method to test the Point class
 public class ass01q03 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
     // Create a point object
     Point      point1 = new      Point(5, 10);

     // Create a copy of point1
     Point      point2 = new     Point(point1);

     // Display the values of point1 and point2
     System.out.println("point1      -> X: " +     point1.getX() + ",     Y: " +       point1.getY());
     System.out.println("point2      -> X: " +     point2.getX() + ",     Y: " +       point2.getY());

     // Modify point2 and show that point1 is not affected
     point2.setX(15);
     point2.setY(20);

     System.out.println("After modification:");
     System.out.println("point1      -> X: " +    point1.getX() + ",     Y: " +        point1.getY());
     System.out.println("point2      -> X: " +    point2.getX() + ",     Y: " +        point2.getY());
 }
}
