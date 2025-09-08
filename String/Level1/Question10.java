package Level1;
import java.util.Scanner;


public class Question10 {


    public static String toLowerCaseManual(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
    }

    public static boolean areStringsEqual(String str1, String str2) {
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

        System.out.print("Enter a complete text to convert and compare: ");
        String originalText = scanner.nextLine();

        String manualLowerCase = toLowerCaseManual(originalText);
        String builtinLowerCase = originalText.toLowerCase();

        boolean areEqual = areStringsEqual(manualLowerCase, builtinLowerCase);

        System.out.println("\n-------------------- Results --------------------");
        System.out.println("Original Text:       " + originalText);
        System.out.println("Manual Conversion:   " + manualLowerCase);
        System.out.println("Built-in Conversion: " + builtinLowerCase);
        System.out.println("\nAre the two lowercase strings identical? " + areEqual);
        System.out.println("-----------------------------------------------");
        
        scanner.close();
    }
}

