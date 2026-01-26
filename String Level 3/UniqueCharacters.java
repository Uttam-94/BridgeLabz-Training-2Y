import java.util.*;
class UniqueCharacters {
    static int length(String s) {
        int i = 0; try { while (true) s.charAt(i++); } catch (Exception e) {}
        return i - 1;
    }

    static char[] unique(String s) {
        int n = length(s);
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j)) unique = false;
            if (unique) temp[k++] = s.charAt(i);
        }
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(unique(s));
    }
}