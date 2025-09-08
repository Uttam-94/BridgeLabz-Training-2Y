import java.util.Scanner;

public class  Question5 {
    

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

    public static String[][] getCharacterFrequencies(String text) {
        int[] charFreq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFreq[text.charAt(i)]++;
        }
        
        char[] uniqueChars = findUniqueCharacters(text);
        
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = String.valueOf(charFreq[currentChar]);
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : data) {
            System.out.printf("   %-5s  | %-5s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String[][] frequencies = getCharacterFrequencies(input);
        displayResult(frequencies);
    }
}
