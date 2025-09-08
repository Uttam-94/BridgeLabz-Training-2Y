import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int total=1;
        for(int i=0;i<arr.length;i++){
            int val = sc.nextInt();
            for(int j=1;j<=val;j++){
                total*=j;
            }
            arr[i]=total;
            total=1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
