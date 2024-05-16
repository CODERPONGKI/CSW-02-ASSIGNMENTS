public class NestedTryCatchExample {
    public static void main(String[] args) {
        String str = "123";
        String invalidStr = "abc";

        try {
            // Outer try-catch block to handle NumberFormatException
            int num1 = Integer.parseInt(str);
            System.out.println("Parsed number: " + num1);

            try {
                // Inner try-catch block to handle ArithmeticException
                int result = num1 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: Division by zero");
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format");
        }
    }
}

        String str = "123";
        String invalidStr = "abc";

        try {
            // Outer try-catch block to handle NumberFormatException
            int num1 = Integer.parseInt(str);
            System.out.println("Parsed number: " + num1);

            try {
                // Inner try-catch block to handle ArithmeticException
                int result = num1 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught-:> Division by zero");
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught-:> Invalid number format");
        }
    }
}
public class NestedTryCatchExample {
    public static void main(String[] args) {
        String str = "123";
        String invalidStr = "abc";

        try {
            // Outer try-catch block to handle NumberFormatException
            int num1 = Integer.parseInt(str);
            System.out.println("Parsed number: " + num1);

            try {
                // Inner try-catch block to handle ArithmeticException
                int result = num1 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: Division by zero");
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format");
        }
    }

}
