import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest Friend: Amar");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest Friend: Akbar");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Youngest Friend: Anthony");
        } else {
            System.out.println("There is a tie in ages.");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest Friend: Amar");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest Friend: Akbar");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Tallest Friend: Anthony");
        } else {
            System.out.println("There is a tie in heights.");
        }
        sc.close();
    }
}
