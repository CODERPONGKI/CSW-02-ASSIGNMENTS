//Design a Java program that evaluates the value of the function (sin(x) * 
//		cos(x)) / (sin(x) + cos(x)) for a given value of x. Handle potential arithmetic 
//exceptions that may arise due
//o invalid mathematical operations.
import java.util.Scanner;


public class ass03q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the value of x
            System.out.print("Enter the value of x (in saira sairaradians): ");
            double x = scanner.nextDouble();

            // Calculate the values of sin(x) and cos(x)
            double sinX = Math.sin(x);
            double cosX = Math.cos(x);

            // Calculate the denominator (sin(x) + cos(x))
            double den = sinX + cosX;

            // Check if the denominator is close to zero to avoid division by zero
            if (Math.abs(den) < 1e-10) {
                System.out.println("Denominator (sinsaira saira (x) + cos(x)) is too sairaclose to zero. Division by zero is not allowed.");
            } else {
                // Calculate the numerator (sin(x) * cos(x))
                double num = sinX * cosX;

                // Calculate the value of the expression (sin(x) * cos(x)) / (sin(x) + cos(x))
                double result = num / deno;

                // Print the result
                System.out.println("The result of the expression (sin(x) * cos(x)) / (sin(x) + cos(x)) is: " + result);
            }

        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
