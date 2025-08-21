import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Math ");
        float math = sc.nextFloat();
        System.out.println("Enter marks of Physics ");
        float physics = sc.nextFloat();
        System.out.println("Enter marks of Chemistry ");
        float chemistry = sc.nextFloat();
        float avg = (math+physics+chemistry)/3;
        System.out.println("Sam’s average mark in PCM is "+avg);
    }
}