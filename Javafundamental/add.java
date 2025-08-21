import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.println("Enter value of A ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter value of B ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of A and B is: "+sum);
        sc.close();
    }
}