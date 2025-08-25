import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int count=0;
        if (a>0){
            for(int i=1;i<=a;i++){
                count+=i;
                
            }
        }
        System.out.println(count);
    }
}