import java.util.Scanner;
public class Question4 {
   

    public static String[][] getCharacterFrequencies(String text) {
        int[] charFreq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFreq[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int count : charFreq) {
            if (count > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int resultIndex = 0;
        for (int i = 0; i < 256; i++) {
            if (charFreq[i] > 0) {
                result[resultIndex][0] = String.valueOf((char) i);
                result[resultIndex][1] = String.valueOf(charFreq[i]);
                resultIndex++;
            }
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println("Character | Frequency");
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


