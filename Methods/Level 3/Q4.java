import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int num = 1221;
        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Arrays Equal: " + arraysEqual(digits, reversed));
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
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

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseDigits(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }
}
