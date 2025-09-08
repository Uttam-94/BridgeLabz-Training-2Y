import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int num = 153;
        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(num, digits));
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest: " + largestTwo[0] + " Second Largest: " + largestTwo[1]);
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest: " + smallestTwo[0] + " Second Smallest: " + smallestTwo[1]);
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

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int n, int[] digits) {
        int len = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, len);
        }
        return sum == n;
    }

    public static int[] findLargestTwo(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }
}
