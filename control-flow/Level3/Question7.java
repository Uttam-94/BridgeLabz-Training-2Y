import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double height = scanner.nextDouble();
        // BMI calculation
        height = height / 100; // convert height to meters
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.4) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        scanner.close();
    }
}
