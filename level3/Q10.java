package level3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String lowerText = text.toLowerCase();

        System.out.println("Original Text: " + text);
        System.out.println("Lowercase Text: " + lowerText);

        System.out.println("Are both equal? " + text.equals(lowerText));

        sc.close();
    }
}
