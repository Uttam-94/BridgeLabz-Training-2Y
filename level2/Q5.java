package level2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] arr = new int[count];
        temp = num;

        for (int i = 0; i < count; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}