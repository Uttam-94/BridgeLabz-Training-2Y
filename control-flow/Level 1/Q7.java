import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter month");
        int m = sc.nextInt();
        System.out.println("Enter day");
        int d = sc.nextInt();
        if (d>=0 && d<=6){
            System.out.println("SpringSeason ");
        }
        else{
            System.out.println("Not SpringSeason");
        }
    }
}