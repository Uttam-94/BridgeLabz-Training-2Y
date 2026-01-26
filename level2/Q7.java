package level2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of persons

        // 0 = height, 1 = weight, 2 = BMI
        double[][] data = new double[n][3];

        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble(); // height in meters
            data[i][1] = sc.nextDouble(); // weight in kg
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]); // BMI
        }

        for (int i = 0; i < n; i++) {
            String status;
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + data[i][0]);
            System.out.println("Weight: " + data[i][1]);
            System.out.println("BMI: " + data[i][2]);
            System.out.println("Status: " + status);
        }

        sc.close();
    }
}
