import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in feet");
        float feet = sc.nextFloat();
        float Yard =  3.0f;
        float Mile = 1760.0f;
        float distanceInYards = feet / Yard;
        float distanceInMiles  = Yard / Mile;

        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);
        sc.close();
    }
}