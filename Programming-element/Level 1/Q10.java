import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Enter Height in cm ");
        Scanner sc = new Scanner(System.in);
        float cm = sc.nextFloat();
        float inch = cm/2.54f;
        float feet = inch/12.0f;
        float inches  = inch %12.0f;
        System.out.println("Your Height in cm is " + cm +" while in feet is " + feet +" and inches is " + inches);
    }
}
