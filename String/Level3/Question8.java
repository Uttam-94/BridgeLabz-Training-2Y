import java.util.Scanner;

public class Question8 {
    

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] charCounts = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            charCounts[text1.charAt(i)]++;
            charCounts[text2.charAt(i)]--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        scanner.close();

        if (areAnagrams(firstString, secondString)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

