import java.util.Scanner;
import java.util.Arrays;
public class Question3 {

    public static int stringLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[] splitTextIntoWords(String text) {
        int length = stringLength(text);
        
        int wordCount = 0;
        if (length > 0) {
            wordCount = 1;
            for (int i = 0; i < length; i++) {
                if (text.charAt(i) == ' ') {
                    wordCount++;
                }
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);

            if (currentChar == ' ') {
                if (stringLength(currentWord) > 0) {
                    words[wordIndex] = currentWord;
                    wordIndex++;
                    currentWord = "";
                }
            } else {
                currentWord += currentChar;
            }
        }

        if (stringLength(currentWord) > 0) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

    public static String[][] splitWordsAndReturnLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
        scanner.close();

        String[] words = splitTextIntoWords(userInput);
        String[][] wordsWithLengths = splitWordsAndReturnLengths(words);

        System.out.println("-------------------------");
        System.out.println("Word\t\tLength");
        System.out.println("-------------------------");
        for (String[] entry : wordsWithLengths) {
            String word = entry[0];
            int length = Integer.parseInt(entry[1]);
            System.out.println(word + "\t\t" + length);
        }
        System.out.println("-------------------------");
    }
}
