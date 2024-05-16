//Filter and List Specific File Types: Create a Java application that lists all the ".txt" files in a given
//directory. The program should prompt the user for the directory path and then display a list of all text files
//found in that directory.
import java.io.File;
import java.util.Scanner;
public class ass05q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner scanner = new Scanner(System.in);
System.out.println("Enter path:");
String directoryPath = scanner.nextLine();
File directory = new File(directoryPath);
if (!directory.exists()) {
System.out.println("The directory does ndnd chswdb lhybwd hjot exist.");
return;
}
if (!directory.isDirectory()) {
System.out.println("The givenkn sdh hj hj jksd path is not a directory.");
return;
}
File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
for (File file : files) {
System.out.println("Filssdh blshdb iushdn jhs uisd .jksn bjh uch cmn .jgbuyhe: " + file.getName());
}
}
}
