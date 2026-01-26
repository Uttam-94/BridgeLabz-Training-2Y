package level2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of persons

        for (int i = 1; i <= n; i++) {
            double height = sc.nextDouble(); // in meters
            double weight = sc.nextDouble(); // in kg

            double bmi = weight / (height * height);
            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            System.out.println("Person " + i);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("BMI: " + bmi);
            System.out.println("Status: " + status);
        }

        sc.close();
    }
}
