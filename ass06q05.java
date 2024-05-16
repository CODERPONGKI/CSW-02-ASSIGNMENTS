//Create a Java program that compares the performance of StringBuilder and StringBuffer when
//performing repeated string concatenations. The program should:
//a. Prompt the user to enter a base string and the number of times it should be concatenated to itself.
//b. Use StringBuilder to concatenate the string the specified number of times, tracking the time taken to
//complete the operation.
//c. Repeat the process using StringBuffer, again tracking the time taken.
//d. Output the time taken for each operation and the final length of the resulting strings to demonstrate
//both the time efficiency and the result of using StringBuilder and StringBuffer.
//Example output of the program could look like this:
//Enter the base string:
//> Hello
//Enter the number of concatenations:
//> 10000Using StringBuilder...
//Time taken: 5 milliseconds
//Final string length: 50000
//Using StringBuffer...
//Time taken: 6 milliseconds
//Final string length: 50000
//Comparison: StringBuilder was faster than StringBuffer by 1 millisecond.
import java.util.Scanner;
public class ass06q05 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the base string: ");
String baseString = scanner.nextLine();
System.out.print("Enter the number of concatenations: ");
int numConcatenations = scanner.nextInt();
long startTime, endTime;
StringBuilder sb = new StringBuilder();
StringBuffer sbuf = new StringBuffer();
// Using StringBuilder
startTime = System.nanoTime();
for (int i = 0; i < numConcatenations; i++) {
sb.append(baseString);
} endTime =
System.nanoTime();
long sbTime = (endTime - startTime) / 1_000_000;
System.out.println("Using StringBuilder...");
System.out.println("Time taken: " + sbTime + " milliseconds");
System.out.println("Final string length: " + sb.length());
// Resetting StringBuilder and StringBuffer
sb = new StringBuilder();
sbuf = new StringBuffer();
// Using StringBuffer
startTime = System.nanoTime();
for (int i = 0; i < numConcatenations; i++) {
sbuf.append(baseString);
} endTime =
System.nanoTime();
long sbufTime = (endTime - startTime) / 1_000_000;
System.out.println("Using StringBuffer...");
System.out.println("Time taken: " + sbufTime + " milliseconds");
System.out.println("Final string length: " + sbuf.length());
// Comparison
long diff = sbTime - sbufTime;
System.out.println("Comparison: StringBuilder was faster than StringBuffer by " + Math.abs(diff) +
" milliseconds.");
}
}

