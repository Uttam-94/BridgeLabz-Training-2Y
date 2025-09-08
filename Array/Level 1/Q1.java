import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int val = sc.nextInt();
            arr[i]=val;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Invalid age");
            }
            else if(arr[i]>=18){
                System.out.println("The student with the age "+arr[i]+" can vote.");
            }
            else{
                System.out.println("The student with the age "+arr[i]+" cannot vote.");
            }
        }
    }
}
