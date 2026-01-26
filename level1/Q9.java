package level1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr2D = new int[rows][cols];
        int[] arr1D = new int[rows * cols];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2D[i][j] = sc.nextInt();
                arr1D[index++] = arr2D[i][j];
            }
        }

        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }

        sc.close();
    }
}
