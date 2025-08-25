import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a%5==0){
            System.out.println(a+" is divisible by 5");
        }
        else{
            System.out.println(a+" is not divisible by 5");
        }
    }
}