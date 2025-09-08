import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest: " + shortest);
        System.out.println("Tallest: " + tallest);
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    static int findShortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    static int findTallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
}
