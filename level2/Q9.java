package level2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of students

        // columns: 0 = physics, 1 = chemistry, 2 = maths
        double[][] marks = new double[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextDouble(); // physics
            marks[i][1] = sc.nextDouble(); // chemistry
            marks[i][2] = sc.nextDouble(); // maths
        }

        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (total / 300) * 100;

            String grade;
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 75) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "Fail";
            }

            System.out.println("Student " + (i + 1));
            System.out.println("Percentage: " + percentage);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
