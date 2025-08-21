import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit Price");
        float uc = sc.nextFloat();
        System.out.println("Enter Quantity");
        float Quantity = sc.nextFloat();
        float total =  uc*Quantity;
        System.out.println("The total purchase price is INR "+total+" if the quantity "+Quantity+" and unit price is INR "+uc);
    }
}