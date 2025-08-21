import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        System.out.println("Enter base:");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Enter exponent,: ");
        int e = sc.nextInt();
        double  power=Math.pow(b,e);
        System.out.println("Power is : "+power);
        sc.close();
    }
}