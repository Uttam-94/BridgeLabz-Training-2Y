package level4;

import java.util.Scanner;

public class Q6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(text.charAt(i) + " : Vowel");
                } else {
                    System.out.println(text.charAt(i) + " : Consonant");
                }
            } else {
                System.out.println(text.charAt(i) + " : Not a Letter");
            }
        }

        sc.close();
    }
}
