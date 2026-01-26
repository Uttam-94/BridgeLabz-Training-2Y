package level3;

import java.util.Scanner;

public class Q9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String upperText = text.toUpperCase();

        System.out.println("Original Text: " + text);
        System.out.println("Uppercase Text: " + upperText);

        System.out.println("Are both equal? " + text.equals(upperText));

        sc.close();
    }
}
