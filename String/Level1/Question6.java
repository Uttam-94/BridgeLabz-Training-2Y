package Level1;
import java.util.Scanner;

public class Question6 {
    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); 
    }
    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught IllegalArgumentException (StringIndexOutOfBoundsException)!");
        } catch (RuntimeException e) {
            System.out.println("Caught some other RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nGenerating IllegalArgumentException:");
       

        System.out.println("\nHandling IllegalArgumentException:");
        handleException(input);
    }
}

