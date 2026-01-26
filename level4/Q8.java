package level4;

import java.util.Scanner;

public class Q8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Student " + i + ": Eligible to vote");
            } else {
                System.out.println("Student " + i + ": Not eligible to vote");
            }
        }

        sc.close();
    }
}
