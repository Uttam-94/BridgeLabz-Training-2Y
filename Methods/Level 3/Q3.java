import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int num = 1729;
        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(num, digits));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : freq) {
            if (row[1] > 0) System.out.println(row[0] + " -> " + row[1]);
        }
    }

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n, int[] digits) {
        int sum = sumOfDigits(digits);
        return n % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}
