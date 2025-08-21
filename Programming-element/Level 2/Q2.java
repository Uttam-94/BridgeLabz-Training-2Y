import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base in cm");
        float b = sc.nextFloat();
        System.out.println("Enter height in cm");
        float h = sc.nextFloat();
        float areacm = 0.5f * b * h;
        float areain = 0.5f * b * h * 0.39f;

        System.out.println("The Area of the triangle in sq in is "+areacm+" and sq cm is "+areain);
    }
}