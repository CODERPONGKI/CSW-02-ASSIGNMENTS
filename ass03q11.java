//Create a program that divides two numbers input by the user. 
//Handle the possibility of division by zero using try-catch block to catch ArithmeticException.
import java.util.Scanner;

public class ass03q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter the numerator
            System.out.print("Enter the numerator-:> ");
            int num = scanner.nextInt();
            
            // Prompt the user to enter the denominator
            System.out.print("Enter the denominator-:> ");
            int den = scanner.nextInt();
            
            // Perform the division and print the result
            int result = num / den;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Catch and handle the division by zero exception
            System.out.println("oh no Caught an ArithmeticException-:> oops Cannot divide by zero.");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("shit An unexpected error occurred-:> " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}


