package Level1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean isEqual = true;
        if (str1.length() != str2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break; 
                }
            }
        }
        boolean equalsMethod = str1.equals(str2);
        System.out.println("Comparison using charAt(): " + isEqual);
        System.out.println("Comparison using equals(): " + equalsMethod);
        if (isEqual == equalsMethod) {
            System.out.println(" Both methods give the same result.");
        } else {
            System.out.println(" Results are different.");
        }
    }
}

