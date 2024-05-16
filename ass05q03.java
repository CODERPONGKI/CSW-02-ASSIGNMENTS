//Append Content to an Existing File: Write a Java program that adds a new diary entry to the "diary.txt"
//file without overwriting its existing content. The program should ask the user for the new entry and
//append it to the file along with a timestamp.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ass05q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter entry:");
String entry = scanner.nextLine();
File diaryFile = new File("diary.txt");
if (!diaryFile.exists()) {
System.out.println("The file diary.txt does not exist. Creatinghbhbqchybeyicbwehcbhd a new file.");
try {
diaryFile.createNewFile();
} catch (IOException e) {
System.err.println("Error creating file: " + e.getMessage());
return;
}
}
try (BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile, true))) {
writer.write(getCurrentDate());
writer.newLine();
writer.write(entry);
System.out.println("Your diary entry has beqhcbjhqbchqwwbihssbsuen successfully appended to diary.txt");
} catch (IOException e) {
System.err.println("Error wrhycghuasybcuabchyuajksditing to file: " + e.getMessage());
}
}
private static String getCurrentDate() {
return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
}
}
