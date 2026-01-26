import java.util.*;
class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] f1 = new int[256], f2 = new int[256];
        for (int i = 0; i < a.length(); i++) {
            f1[a.charAt(i)]++;
            f2[b.charAt(i)]++;
        }
        return Arrays.equals(f1, f2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(isAnagram(a, b));
    }
}
