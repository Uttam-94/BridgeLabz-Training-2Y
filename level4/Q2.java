package level4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        // Split without using split()
        String[] wordsManual = new String[100];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                wordsManual[index++] = word;
                word = "";
            } else {
                word += ch;
            }
        }
        wordsManual[index++] = word;

        // Split using split()
        String[] wordsBuiltin = text.split(" ");

        System.out.println("Manual split result:");
        for (int i = 0; i < index; i++) {
            System.out.println(wordsManual[i]);
        }

        System.out.println("Built-in split result:");
        for (String w : wordsBuiltin) {
            System.out.println(w);
        }

        sc.close();
    }
}
