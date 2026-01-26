import java.util.*;
class BMIAnalyzer {
    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    static String[][] compute(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;
            double bmi = weight / (heightM * heightM);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    static void display(String[][] arr) {
        System.out.println("Height  Weight  BMI   Status");
        for (String[] row : arr) {
            System.out.println(row[0] + "   " + row[1] + "   " + row[2] + "   " + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight and height(cm) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        display(compute(data));
    }
}