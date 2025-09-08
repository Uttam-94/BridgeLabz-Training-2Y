import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        int[][] empData = generateEmployeeData(10);
        double[][] newData = calculateBonus(empData);
        displayResults(empData, newData);
    }

    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; // col0: salary, col1: years
        for (int i = 0; i < n; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            int years = 1 + (int)(Math.random() * 10); // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] newData = new double[data.length][2]; 
        // col0: bonus, col1: new salary
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;
            if (years > 5) bonus = salary * 0.05;
            else bonus = salary * 0.02;
            double newSalary = salary + bonus;
            newData[i][0] = bonus;
            newData[i][1] = newSalary;
        }
        return newData;
    }

    public static void displayResults(int[][] data, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-5s %-10s %-8s %-12s %-12s%n", "ID", "OldSalary", "Years", "Bonus", "NewSalary");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];
            System.out.printf("%-5d %-10d %-8d %-12.2f %-12.2f%n", (i+1), oldSalary, years, bonus, newSalary);
            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-8s %-12.2f %-12.2f%n", "TOTAL", totalOld, "", totalBonus, totalNew);
    }
}
