//Create and Write to a File: Write a Java program that prompts the user for a diary entry, then creates a
//file named "diary.txt" and writes the current date followed by the user's entry into this file. Ensure the
//program checks if the file already exists and informs the user, to avoid overwriting any previous content.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ass05q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner(System.in);
System.out.println("Enter your diary entry:");
String entry = scanner.nextLine();
File diaryFile = new File("diary.txt");
if (diaryFile.exists()) {
System.out.println("The file diary.txt already exists. saiea sairydtueydfwedjnewjldc Please consider a different file name to avoid
overwriting previous content.");
return;
}
try (BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile))) {
writer.write(getCurrentDate());
writer.newLine();
writer.write(entry);
System.out.println("Your diary entry has been successfully wiygfiybfiherggwnwrkjgb ritten to diary.txt");
} catch (IOException e) {
System.err.println("Error writing to file: " + e.getMessage());
}
}
private static String getCurrentDate() {
return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
}
}
