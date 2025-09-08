import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        double[][] data = new double[10][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        String[] status = getStatus(data);
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + data[i][0] + " Height: " + data[i][1] + " BMI: " + data[i][2] + " Status: " + status[i]);
        }
    }

    static void calculateBMI(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            double h = arr[i][1] / 100;
            arr[i][2] = arr[i][0] / (h * h);
        }
    }

    static String[] getStatus(double[][] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2] <= 18.4) result[i] = "Underweight";
            else if (arr[i][2] <= 24.9) result[i] = "Normal";
            else if (arr[i][2] <= 39.9) result[i] = "Overweight";
            else result[i] = "Obese";
        }
        return result;
    }
}
