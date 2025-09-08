import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value from 6-9");
        int val = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=val*(i+1);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(val+" x "+(i+1)+" = "+arr[i]);
        }
    }
}
