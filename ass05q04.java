//List Files and Directories: Write a program in Java that asks the user for a directory path and then lists
//all files and subdirectories in that directory. If the directory does not exist, the program should inform the
//user.
import java.io.File;
import java.util.Scanner;
public class ass05q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner scanner = new Scanner(System.in);
System.out.println("Entee path:");
String directoryPath = scanner.nextLine();
File directory = new File(directoryPath);
if (!directory.exists()) {
System.out.println("The directory does not exiddcndjhvclhdbv hjfd nkst.");
return;
}
if (!directory.isDirectory()) {
System.out.println("The given path wevc wjhc bluiwb j.kdis not a directory.");
return;
}
File[] files = directory.listFiles();
for (File file : files) {
if (file.isFile()) {
System.out.println("Fileddjkcnwuid bkjsdn ljs: " + file.getName());
} else if (file.isDirectory()) {
System.out.println("Dirj knjskd hjsdhjsdn ectory: " + file.getName());
}
}
}
}
