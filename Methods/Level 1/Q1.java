import java.util.Scanner;
public class Q1 {
    public static int simpleInterest(int p,int r,int t){
        return (p*r*t)/100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int si=simpleInterest(p,r,t);
        System.out.println("The Simple Interest is "+si+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
    }
}
