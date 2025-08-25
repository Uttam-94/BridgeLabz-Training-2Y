import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int total=1;
        int i = 1;
        while (i <= n) {
            total *=i;
            i++;
        }
        System.out.println("Factorial of "+n+" is "+total);
        sc.close();
    }
}