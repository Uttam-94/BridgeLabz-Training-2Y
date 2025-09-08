package Level1;
import java.util.Scanner;

public class Question3 {

    static char[] myToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();   

        char[] arr1 = myToCharArray(str);

        char[] arr2 = str.toCharArray();

        boolean same = compare(arr1, arr2);

        System.out.print("User method: ");
        for (char c : arr1) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in method: ");
        for (char c : arr2) {
            System.out.print(c + " ");
        }

        System.out.println("\nBoth are same? " + same);
    }
}
