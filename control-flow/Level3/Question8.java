import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        // Harshad number
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if (originalNum % sum == 0) {
            System.out.println(originalNum + " is a Harshad number.");
        } else {
            System.out.println(originalNum + " is not a Harshad number.");
        }
        scanner.close();    
    }
}
