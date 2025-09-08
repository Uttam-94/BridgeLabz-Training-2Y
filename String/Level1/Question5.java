package Level1;

import java.util.Scanner;
public class Question5 {

    static void generateException(String str) {
        System.out.println("Character at index 10: " + str.charAt(10));
    }

    static void handleException(String str) {
        try {
            System.out.println("Character at index 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(input);
    }
}


