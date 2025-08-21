import java.util.*;
public class Q8{
    public static void main(String[] args) {
        System.out.println("Enter km:");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float mile = km * 0.6f;
        System.out.println("The distance " +km+" km in miles is "+mile);
    }
}