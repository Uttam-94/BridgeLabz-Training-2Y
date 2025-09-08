import java.util.Scanner;
public class Q6 {
    public static int sumNatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++) sum+=i;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sumNatural(n);
        System.out.println(sum);
    }
}
