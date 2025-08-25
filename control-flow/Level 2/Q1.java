import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0,even=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) {
                System.out.println(i+" is an Even number");
            }
            else{
                System.out.println(i+" is an Odd number");
            }
        }
        sc.close();
    }
}