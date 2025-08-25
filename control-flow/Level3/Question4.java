import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true; // assume the number is prime

        if (num <= 1) {
            isPrime = false; // prime numbers are greater than 1
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; // found a divisor
                    break;           // no need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}
