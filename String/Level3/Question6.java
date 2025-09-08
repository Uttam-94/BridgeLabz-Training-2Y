import java.util.Scanner;

public class Question6 {

    public static String[][] getCharacterFrequencies(String text) {
        char[] charArray = text.toCharArray();
        String[][] result = new String[charArray.length][2];
        int resultIndex = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '\0') {
                int count = 1;
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        count++;
                        charArray[j] = '\0';
                    }
                }
                result[resultIndex][0] = String.valueOf(charArray[i]);
                result[resultIndex][1] = String.valueOf(count);
                resultIndex++;
            }
        }
        
        String[][] finalResult = new String[resultIndex][2];
        for (int i = 0; i < resultIndex; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
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

