import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double total=0;
        while(true){
            System.out.println("Enter digit");
            double n = sc.nextDouble();
            total+=n;
            if(n==0){
                break;
            }
    }
    System.out.println(total);
    sc.close();
}
}