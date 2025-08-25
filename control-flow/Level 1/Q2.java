import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number1");
        int a = sc.nextInt();
        System.out.println("Enter a number2");
        int b = sc.nextInt();
        System.out.println("Enter a number3");
        int c = sc.nextInt();
        if (a<b && a<c){
            System.out.println(a+" is the smallest");
        }
        else if(b<c){
            System.out.println(b+" is the smallest");
        }
        else{
            System.out.println(c+" is the smallest");
        }
    }
}