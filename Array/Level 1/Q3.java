import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=val*(i+1);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(val+" x "+(i+1)+" = "+arr[i]);
        }
    }
}
