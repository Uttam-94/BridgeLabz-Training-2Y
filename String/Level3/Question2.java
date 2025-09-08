 import java.util.Scanner;
public class Question2 {
   

    public static char[] findUniqueCharacters(String text) {
        int len = text.length();
        char[] uniqueChars = new char[len];
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (text.charAt(i) == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount] = text.charAt(i);
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] uniqueCharacters = findUniqueCharacters(input);

        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

