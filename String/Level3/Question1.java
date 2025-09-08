import java.util.Scanner;

public class Question1 {

    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        String[] result = new String[2];
        double heightMeters = heightCm / 100.0;
        double bmi = weight / (heightMeters * heightMeters);
        
        result[0] = String.format("%.2f", bmi);

        if (bmi < 18.5) {
            result[1] = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            result[1] = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            result[1] = "Overweight";
        } else {
            result[1] = "Obese";
        }
        return result;
    }

    public static String[][] processData(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiInfo = calculateBMIAndStatus(weight, height);
            
            results[i][0] = String.format("%.2f", height);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = bmiInfo[0];
            results[i][3] = bmiInfo[1];
        }
        return results;
    }
    
    public static void displayResults(String[][] results) {
        
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%s\t\t%s\n",
                i + 1,
                Double.parseDouble(results[i][0]),
                Double.parseDouble(results[i][1]),
                results[i][2],
                results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) for Person %d: ", i + 1);
            personData[i][0] = scanner.nextDouble();
            System.out.printf("Enter height (cm) for Person %d: ", i + 1);
            personData[i][1] = scanner.nextDouble();
        }
        
        String[][] finalResults = processData(personData);
        displayResults(finalResults);
        
        scanner.close();
    }
}