package level2;

import java.util.Scanner;

public class Q8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double total = physics + chemistry + maths;
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

        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}


