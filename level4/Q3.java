package level4;

import java.util.Scanner;

public class Q3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String[] words = text.split(" ");

        // 2D array: column 0 = word, column 1 = length
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " - " + result[i][1]);
        }

        sc.close();
    }
}
