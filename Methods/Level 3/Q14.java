import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of matrix A: ");
        int c1 = sc.nextInt();
        System.out.print("Enter rows of matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = generateMatrix(r1, c1);
        int[][] B = generateMatrix(r2, c2);

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("Addition of A and B:");
            printMatrix(add(A, B));
            System.out.println("Subtraction of A and B:");
            printMatrix(subtract(A, B));
        } else {
            System.out.println("Addition/Subtraction not possible due to different dimensions.");
        }

        if (c1 == r2) {
            System.out.println("Multiplication of A and B:");
            printMatrix(multiply(A, B));
        } else {
            System.out.println("Multiplication not possible (columns of A != rows of B).");
        }
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random values 0-9
            }
        }
        return matrix;
    }

    public static int[][] add(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
