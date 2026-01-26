package level3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Substring using charAt()
        String result1 = "";
        for (int i = start; i < end; i++) {
            result1 = result1 + text.charAt(i);
        }

        // Substring using built-in method
        String result2 = text.substring(start, end);

        // Compare both strings
        System.out.println("Using charAt(): " + result1);
        System.out.println("Using substring(): " + result2);
        System.out.println("Are both equal? " + result1.equals(result2));

        sc.close();
    }
}
