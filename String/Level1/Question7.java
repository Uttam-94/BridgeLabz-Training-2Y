package Level1;
import java.util.Scanner;

public class Question7 {

    static void generateException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = sc.next();  
        int number = Integer.parseInt(text);
        System.out.println("You entered number: " + number);
    }

    
    static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = sc.next();  

        try {
            int number = Integer.parseInt(text);
            System.out.println("You entered number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException! Input is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NumberFormatException:");
        

        System.out.println("\nHandling NumberFormatException:");
        handleException();
    }
}


