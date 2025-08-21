import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println("Area of circle is : "+area);
        sc.close();
    }
}