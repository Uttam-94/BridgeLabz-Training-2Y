package Level1;
import java.util.Scanner;
public class Question9 {
    static String toUpperCaseManual(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);  // convert lowercase to uppercase
            }
            result += c;  // add to result
        }
        return result;
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manualUpper = toUpperCaseManual(text);
        String builtInUpper = text.toUpperCase();

        boolean same = compareStrings(manualUpper, builtInUpper);

        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Both are same? " + same);
    }
}

