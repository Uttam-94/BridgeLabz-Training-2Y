import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i=0;i<arr.length;i++){
            int val = sc.nextInt();
            if(i==0){
                arr[i]="0";
            }
            else if(i%3==0 && i%5==0){
                arr[i]="FizzBuzz";
            }
            else if(i%3==0){
                arr[i] = "Fizz";
            }
            else if(i%5==0){
                arr[i]="Buzz";
            }
            else{
                arr[i]=String.valueOf(i);
            }     
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Position "+i+" = "+arr[i]);
        }
    }
}
