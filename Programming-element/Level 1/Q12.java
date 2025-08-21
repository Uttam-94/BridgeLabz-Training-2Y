import java.util.*;
public class Q12{
    public static void main(String[] args) {
        System.out.println("Enter distance in feets :");
        Scanner sc = new Scanner(System.in);
        float feet = sc.nextFloat();
        float yards = feet / 3.0f;
        float miles = yards / 1760.0f;
    System.out.println("Your distance in feet is " + feet +" which is " + yards + " yards" +" or " + miles + " miles");    }
}