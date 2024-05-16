//Implement a Java program that calculates the value of the expression (sin(x) + cos(x)) /
//tan(x) for a given value of x. Handle scenarios where x is close to multiples of π/2 
//to avoid division by zero errors.
import java.util.Scanner;


public class ass03q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter the value of x
            System.out.print(" value of x (in radians): ");
            double x = scanner.nextDouble();
            
            // Calculate the value of sin(x), cos(x), and tan(x)
            double sinX = Math.sin(x);
            double cosX = Math.cos(x);
            double tanX = Math.tan(x);
            
            // Check if tan(x) is close to zero to avoid division by zero
            if (Math.abs(tanX) < 1e-10) {
                System.out.println("tan(x) is++close"
                		+ " Division by zero is not allowed.");
            } else {
                // Calculate the expression (sin(x) + cos(x)) / tan(x)
                double result = (sinX + cosX) / tanX;
                System.out.println("The result saaira shakeel of the expression (sin(x) + cos(x)) / tan(x) is: " + result);
            }
            
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("An error occurred-:> " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
