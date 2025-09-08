import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int val = sc.nextInt();
            arr[i]=val;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("-ve number");
            }
            else if(arr[i]==0){
                System.out.println("Zero");
            }
            else{
                System.out.println("+ve number");
                if(arr[i]%2==0){
                    System.out.println("Number is even");
                }
                else{
                    System.out.println("NUmber is odd");
                }
            }
            if(arr[0]>arr[4]){
                System.out.println("Greater");
            }
            else if(arr[0]<arr[4]){
                System.out.println("Smaller");
            }
            else{
                System.out.println("Equal");
            }
        }
    }
}
