import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        System.out.println("Enter radius of cylinder: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println("Enter height of cylinder: ");
        float h = sc.nextFloat();
        float volume = 3.14f*r*r*h;
        System.out.println("Volume of cylinder is : "+volume);
        sc.close();
    }
}