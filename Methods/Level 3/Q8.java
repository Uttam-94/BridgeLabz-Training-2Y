import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All Unique: " + areUnique(otps));
    }

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        return set.size() == arr.length;
    }
}
