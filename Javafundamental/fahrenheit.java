import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Celsius: ");
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float fahrenheit = (c*9/5)+32;
        System.out.println("Temperature in fahrenheit is: "+fahrenheit);
        sc.close();
    }
}