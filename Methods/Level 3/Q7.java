import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        int num = 12;
        int[] factors = getFactors(num);
        System.out.println("Number: " + num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubes(factors));
    }

    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) if (f > max) max = f;
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static long productOfCubes(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= (long)Math.pow(f, 3);
        return prod;
    }
}
