package level2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalBonus = 0;

        for (int i = 1; i <= 10; i++) {
            int years = sc.nextInt();
            double salary = sc.nextDouble();

            double bonus;
            if (years >= 5) {
                bonus = salary * 0.10;
            } else {
                bonus = salary * 0.05;
            }

            double newSalary = salary + bonus;
            totalBonus += bonus;

            System.out.println("Employee " + i);
            System.out.println("Old Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
        }

        System.out.println("Total Bonus to be paid by Zara: " + totalBonus);

        sc.close();
    }
}
