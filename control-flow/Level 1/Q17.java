import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter salary");
        double s = sc.nextDouble();
        System.out.println("Enter years");
        double y = sc.nextDouble();
        if(y>5){
            double bonus=s*0.05;
            System.out.println("Bonus is: "+bonus);
        }
        else{
            System.out.println("No bonus");
        }
        
        sc.close();
    }
}