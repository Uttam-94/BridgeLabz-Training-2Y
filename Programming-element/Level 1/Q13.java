import java.util.*;
public class Q13{
    public static void main(String[] args) {
        System.out.println("Enter unit price :");
        Scanner sc = new Scanner(System.in);
        float uc = sc.nextFloat();
        System.out.print("Enter quantity: ");
        float quantity = sc.nextFloat();
        float totalPrice = uc * quantity;
        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity is " + quantity +" and unit price is INR " + uc);   
        }
}