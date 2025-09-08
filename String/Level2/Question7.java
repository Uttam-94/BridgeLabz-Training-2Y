import java.util.Scanner;

public class Question7 {
    public static int[] findTrimPoints(String text) {
        int length = text.length();
        int start = 0;
        int end = length - 1;

        while (start < length && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String mySubstring(String text, int start, int end) {
        String result = "";
        if (start > end) {
            return result;
        }

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean myEquals(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = scanner.nextLine();
        scanner.close();

        int[] trimPoints = findTrimPoints(userInput);
        String trimmedStringCustom = mySubstring(userInput, trimPoints[0], trimPoints[1]);
        String trimmedStringBuiltIn = userInput.trim();

        System.out.println("\nOriginal string: \"" + userInput + "\"");
        System.out.println("Trimmed string (custom method): \"" + trimmedStringCustom + "\"");
        System.out.println("Trimmed string (built-in method): \"" + trimmedStringBuiltIn + "\"");

        boolean areEqual = myEquals(trimmedStringCustom, trimmedStringBuiltIn);
        System.out.println("Are the two trimmed strings equal? " + areEqual);
    }
}


