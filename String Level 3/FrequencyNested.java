import java.util.*;
class FrequencyNested {
    static void freq(String s) {
        char[] arr = s.toCharArray();
        int[] f = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            f[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { f[i]++; arr[j] = '0'; }
            }
        }
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != '0') System.out.println(arr[i] + " : " + f[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        freq(sc.nextLine());
    }
}