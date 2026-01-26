import java.util.*;
class FrequencyUnique {
    static char[] unique(String s) {
        char[] t = new char[s.length()]; int k = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean u = true;
            for (int j = 0; j < i; j++) if (s.charAt(i) == s.charAt(j)) u = false;
            if (u) t[k++] = s.charAt(i);
        }
        return Arrays.copyOf(t, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i)]++;
        for (char c : unique(s)) System.out.println(c + " : " + f[c]);
    }
}