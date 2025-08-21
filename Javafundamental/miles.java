import java.util.Scanner;

public class miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Kilometer to miles is "+miles);
        sc.close();
    }
}
