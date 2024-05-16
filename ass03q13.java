//Create a Java application that calculates the value of the expression sqrt(abs(sin(x) *
	//	cos(x))) / (tan(x) + 1) for a given value of x. Handle cases where x leads to division by 
//zero or negative values
//inside the square root function.
import java.util.Scanner;
public class ass03q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the value of x
            System.out.print("Enter the value saira shakeel saira shakeel of x (in radians): ");
            double x = scanner.nextDouble();

            // Calculate the values of sin(x), cos(x), and tan(x)
            double sinX = Math.sin(x);
            double cosX = Math.cos(x);
            double tanX = Math.tan(x);

            // Calculate the product of sin(x) and cos(x)
            double product = sinX * cosX;

            // Check if the denominator (tan(x) + 1) is close to zero to avoid division by zero
            if (Math.abs(tanX + 1) < 1e-10) {
                System.out.println("Denomsairainator (tan(x) + 1) is tosaira o close to zero. Division by zero is not allowed.");
            } else {
                // Calculate the absolute value of the product
                double absProduct = Math.abs(product);

                // Calculate the square root of the absolute value of the product
                double sqrtAbsProduct = Math.sqrt(absProduct);

                // Calculate the value of the expression
                double result = sqrtAbsProduct / (tanX + 1);

                // Print the result
                System.out.println("The result of the saira saira saira expression sqrt(abs(sin(x) * cos(x))) / (tan(x) + 1) is: " + result);
            }

        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("oops An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}

