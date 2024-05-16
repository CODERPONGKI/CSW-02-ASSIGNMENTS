//Create a method that takes a string input and converts it to an integer.
//Handle NumberFormatExceptio
import java.util.Scanner;
public class ass03q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer-:> ");
        int numbersss = scanner.nextInt();

        try {
            if (numbersss < 0) {
                throw new ArithmeticException(" oops Cannot calculate square root of a negative number.");
            }
            double sqrt = Math.sqrt(numbersss);
            System.out.println("Square root of " + numbersss + " is-:> " + sqrt);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException-:> " + e.getMessage());
        }
    }
}


