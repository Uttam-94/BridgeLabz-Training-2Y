package Level1;

import java.util.Scanner;

public class Question2 {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String manualSubstring = "";
        for (int i = start; i < end; i++) {
            manualSubstring = manualSubstring + text.charAt(i);
        }
        String builtinSubstring = text.substring(start, end);
        boolean areEqual = true;
        if (manualSubstring.length() == builtinSubstring.length()) {
            for (int i = 0; i < manualSubstring.length(); i++) {
                if (manualSubstring.charAt(i) != builtinSubstring.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);
        System.out.println("Are both substrings equal? " + areEqual);

        sc.close();
    }
}

