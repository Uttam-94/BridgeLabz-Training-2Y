package level1;

import java.util.Scanner;

public class Q8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] factors = new int[num];
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count++] = i;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }

}
