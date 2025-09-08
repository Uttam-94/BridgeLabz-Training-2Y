import java.util.Scanner;
public class Q3 {
    public static int rounds(double a,double b,double c){
        double perimeter=a+b+c;
        return (int)Math.ceil(5000/perimeter);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        int r=rounds(a,b,c);
        System.out.println("The athlete must complete "+r+" rounds to run 5 km");
    }
}
