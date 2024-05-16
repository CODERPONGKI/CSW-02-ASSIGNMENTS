//Develop a program that performs complex mathematical (may have log, trigonometric 
	//	and algebraic functions) computations. Handle unchecked NullPointerException gracefully 
//using 
//try-catch block and provide a meaningful error message.
public class ass03q09{
    public static void main(String[] args) {
        try {
            String numberzzzz = null;
            double value = Double.parseDouble(numberzzzz);  // This will cause a NullPointerException
            System.out.println("Logarithm: " + Math.log(value));
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException-:> oh no Input value is null.");
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException-:> oh no Input value is not a number.");
        }
    }
    public class HandleNumberFormatException {
        public static void main(String[] args) {
            try {
                String invalidNumber01 = "abcdefgh";
                int number = Integer.parseInt(invalidNumber01);
            } catch (NumberFormatException e) {
                System.out.println("Caught a NumberFormatException-:> " + e.getMessage());
            }
        }
    


