import java.util.Scanner;

public class Q3 {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int digi = sc.nextInt();
      int[] arr = new int[5];

      for(int i = 0; digi > 0; ++i) {
         arr[i] = digi % 10;
         digi /= 10;
      }

      int max = 0;
      int smax = 0;

      for(int i = 0; i < arr.length; ++i) {
         if (arr[i] > max) {
            smax = max;
            max = arr[i];
         } else if (arr[i] > smax && smax != max) {
            smax = arr[i];
         }
      }

      System.out.println("Largest " +max);
      System.out.println("Second largest "+smax);
   }
}