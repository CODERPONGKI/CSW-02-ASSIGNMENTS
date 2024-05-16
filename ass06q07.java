//Character Array and Search: Ask for a string from the user. Convert the string to a character array.
//Prompt the user to enter a character to search in the string. Find the first and last occurrences of the
//character. Display the character array and the positions found (if any).
import java.util.Scanner;
public class ass06q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.nextLine();
char[] charArray = str.toCharArray();
System.out.print("Enter a character to search: ");
char searchChar = scanner.next().charAt(0);
int firstIndex = -1, lastIndex = -1;
for (int i = 0; i < charArray.length; i++) {
if (charArray[i] == searchChar) {
if (firstIndex == -1) {
firstIndex = i;
}l
astIndex = i;
}
}
if (firstIndex != -1) {
System.out.println("Character array:");
for (int i = 0; i < charArray.length; i++) {
System.out.print(charArray[i] + " ");
}
System.out.println("\nFirst occurrence of '" + searchChar + "': " + firstIndex);
System.out.println("Last occurrence of '" + searchChar + "': " + lastIndex);
} else {
System.out.println("Character '" + searchChar + "' not found in the string.");
}
}
}
