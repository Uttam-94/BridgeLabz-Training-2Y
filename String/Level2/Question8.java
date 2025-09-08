import java.util.Random;
import java.util.Scanner;

public class Question8 {
 


    public static int[] generateAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);
            if (age < 0) {
                results[i][1] = "false";
            } else {
                results[i][1] = String.valueOf(age >= 18);
            }
        }
        return results;
    }

    public static void displayResults(String[][] data) {
        System.out.println("-------------------------");
        System.out.println("Age\t\tCan Vote");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.close();

        int[] ages = generateAges(numberOfStudents);
        String[][] eligibility = checkVotingEligibility(ages);
        displayResults(eligibility);
    }
}

