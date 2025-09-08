
import java.util.Scanner;



public class Question1 {
    
    public static int getLengthManually(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        int manualLength = getLengthManually(userInput);
        int builtinLength = userInput.length();

        System.out.println("\n-------------------- Results --------------------");
        System.out.println("Length from user-defined method: " + manualLength);
        System.out.println("Length from built-in length() method: " + builtinLength);
        System.out.println("-----------------------------------------------");

        scanner.close();
    }
}

