 import java.util.Scanner;
public class  Question3 {

    public static char findFirstNonRepeatingChar(String text) {
        int[] charFreq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFreq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (charFreq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char result = findFirstNonRepeatingChar(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
    }
}
