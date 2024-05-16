//Case Conversion and Comparison: Prompt the user to input two strings. Convert both strings to
//lowercase and uppercase. Compare the converted strings to check case-insensitive equality. Display the
//converted strings and the result of the comparison.
import java.util.Scanner;
public class aaass06q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first string: ");
String str1 = scanner.nextLine();
System.out.print("Enter the second string: ");
String str2 = scanner.nextLine();
// Convert strings to lowercase
String lowerStr1 = str1.toLowerCase();
String lowerStr2 = str2.toLowerCase();
// Convert strings to uppercase
String upperStr1 = str1.toUpperCase();
String upperStr2 = str2.toUpperCase();
// Compare converted strings for case-insensitive equality
boolean areEqualIgnoreCase = lowerStr1.equals(lowerStr2);
// Display converted strings and result of comparison
System.out.println("Converted to lowercase:");
System.out.println("String 1: " + lowerStr1);
System.out.println("String 2: " + lowerStr2);
System.out.println("\nConverted to uppercase:");
System.out.println("String 1: " + upperStr1);
System.out.println("String 2: " + upperStr2);
System.out.println("\nCase-insensitive comparison result: " + areEqualIgnoreCase);
}
}
