package level2;

import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();

        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();

        // Youngest
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest: Amar");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        // Tallest
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest: Amar");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }

        sc.close();
    }
}
