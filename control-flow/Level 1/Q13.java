import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n = sc.nextDouble();
        double total=0;
        double i=1;
        while (i<=n) {
            total+=i;
            i++;
        }
        double check=(n*(n+1))/2;
        if(total==check){
            System.out.println("since "+total+" and "+check+" are both same it is correct");
        }
        else{
            System.out.println("not correct");
        }
        sc.close();
    }
}