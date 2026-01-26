import java.util.*;
class FrequencyASCII {
    static String[][] freq(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i)]++;
        String[][] res = new String[s.length()][2];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (f[c] != 0) {
                res[k][0] = String.valueOf(c);
                res[k][1] = String.valueOf(f[c]);
                f[c] = 0; k++;
            }
        }
        return Arrays.copyOf(res, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (String[] r : freq(s)) System.out.println(r[0] + " : " + r[1]);
    }
}
