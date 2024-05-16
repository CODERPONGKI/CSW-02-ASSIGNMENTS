//Write a Java program to find the quare root of integer numbers. Demonstrate the use of 
//try-catch block to handle ArithmeticException
import java.util.Scanner;

public class ass03q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator-:> ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator-:> ");
        int denominator = scanner.nextInt();

        try {
            int resultzz = numerator / denominator;
            System.out.println("Result-:> " + resultzz);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException-:> Cannot divide by zero.");
        }
    }
}


