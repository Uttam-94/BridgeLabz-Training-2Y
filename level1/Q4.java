package level1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0, sum = 0;

        while (count < 10) {
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }

            arr[count] = num;
            sum += num;
            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(sum);

        sc.close();
    }
}
