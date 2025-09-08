import java.util.Scanner;
public class Q2 {
    public static int handshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=handshakes(n);
        System.out.println("The maximum number of possible handshakes is "+h);
    }
}
