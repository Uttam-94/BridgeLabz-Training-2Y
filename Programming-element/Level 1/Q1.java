import java.util.*;
public class Q1{
    public static void main(String[] args) {
        System.out.println("Enter Year of birth of Harry:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int year = 2024;
        int age = year - a;
        System.out.println("Harry's age in 2024 is "+age);
    }
}