//Implement a Java program that reads a file path from the command line argument and attempts 
//to read the contents of the file. If the file path is null or points to a non-existent file, 
//throw a custom FileNotFoundException. If the file exists but cannot be read due to permission
//issues, throw a custom FileReadPermissionException. Your task is to create
//these custom exception classes and handle them appropriately in your program.
public class CustomNullPointerException extends NullPointerException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class ass03q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        try {
            String str = null;
            if (str == null) {
                throw new CustomNullPointerException("Custom Null Pointer Exception-:> The string is null.");
            }
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
