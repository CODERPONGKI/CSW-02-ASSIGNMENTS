

public class ass03q06 {
    public static void main(String[] args) {
        String input = "a2b3c4d5";

        try {
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Input string is null or empty which ");
            }

            boolean found = false;
            for (int i = 2; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c) && isVowel(input.charAt(i-2)) && !isVowel(input.charAt(i-1))) {
                    System.out.println("hey there i Found numeric character preceded by vowel and consonant: " + c);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No numeric character found preceded by a vowel and consonant.");
            }
        } catch (NullPointerException e) {
            System.out.println("damn  oops Caught a NullPointerException: " + e.getMessage());
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

