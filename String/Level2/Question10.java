import java.util.Random;
import java.util.Scanner;

public class Question10 {
    

    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(91) + 10;
            scores[i][1] = random.nextInt(91) + 10;
            scores[i][2] = random.nextInt(91) + 10;
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][2];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percentage = (double) total / 300 * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][1];
            if (percentage >= 90) {
                grades[i] = "A";
            } else if (percentage >= 80) {
                grades[i] = "B";
            } else if (percentage >= 70) {
                grades[i] = "C";
            } else if (percentage >= 60) {
                grades[i] = "D";
            } else if (percentage >= 50) {
                grades[i] = "E";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tPercentage\tGrade");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f%%\t\t%s\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    stats[i][0],
                    stats[i][1],
                    grades[i]);
        }
        System.out.println("------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.close();

        int[][] studentScores = generateScores(numberOfStudents);
        double[][] studentStats = calculateStats(studentScores);
        String[] studentGrades = calculateGrades(studentStats);
        displayScorecard(studentScores, studentStats, studentGrades);
    }
}
    

