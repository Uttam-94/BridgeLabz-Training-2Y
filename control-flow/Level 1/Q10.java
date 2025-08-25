import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n = sc.nextDouble();
        double total=n;
        while(n!=0){
            System.out.println("Enter digit");
            n = sc.nextDouble();
            total+=n;
    }
    System.out.println(total);
    sc.close();
}
}