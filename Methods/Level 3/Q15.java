import java.util.Random;
import java.util.Scanner;

public class Q15 {
    static int[][] createMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    static int[][] transpose(int[][] m) {
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];
        return t;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        double[][] inv = new double[2][2];
        if (det != 0) {
            inv[0][0] = m[1][1] / (double) det;
            inv[0][1] = -m[0][1] / (double) det;
            inv[1][0] = -m[1][0] / (double) det;
            inv[1][1] = m[0][0] / (double) det;
        }
        return inv;
    }

    static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        double[][] inv = new double[3][3];
        if (det != 0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int[][] minor = new int[2][2];
                    int r = 0, c = 0;
                    for (int x = 0; x < 3; x++) {
                        if (x == i) continue;
                        c = 0;
                        for (int y = 0; y < 3; y++) {
                            if (y == j) continue;
                            minor[r][c++] = m[x][y];
                        }
                        r++;
                    }
                    inv[j][i] = Math.pow(-1, i + j) * determinant2x2(minor) / (double) det;
                }
            }
        }
        return inv;
    }

    static void display(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    static void display(double[][] m) {
        for (double[] row : m) {
            for (double v : row) System.out.printf("%.2f ", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m2 = createMatrix(2, 2);
        int[][] m3 = createMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        display(m2);
        System.out.println("Transpose:");
        display(transpose(m2));
        System.out.println("Determinant: " + determinant2x2(m2));
        System.out.println("Inverse:");
        display(inverse2x2(m2));

        System.out.println("\n3x3 Matrix:");
        display(m3);
        System.out.println("Transpose:");
        display(transpose(m3));
        System.out.println("Determinant: " + determinant3x3(m3));
        System.out.println("Inverse:");
        display(inverse3x3(m3));
    }
}