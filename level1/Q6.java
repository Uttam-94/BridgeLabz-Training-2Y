package level1;

import java.util.Scanner;

public class Q6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;

        for (int i = 0; i < 11; i++) {
            height[i] = sc.nextDouble();
            sum += height[i];
        }

        double mean = sum / 11;
        System.out.println(mean);

        sc.close();
    }
}
