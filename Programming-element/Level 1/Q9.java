import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter fee ");
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        System.out.println("Enter discount ");
        int discount = sc.nextInt();
        int x = (fee*discount)/100;
        int y = x+fee;
        System.out.println("The discount amount is INR "+x+" and final discounted fee is INR "+y);
    }
}
