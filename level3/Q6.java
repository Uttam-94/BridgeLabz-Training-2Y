package level3;

public class Q6 {
    public static void main(String[] args) {
        int age = -5;

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        System.out.println("Age: " + age);
    }
}
