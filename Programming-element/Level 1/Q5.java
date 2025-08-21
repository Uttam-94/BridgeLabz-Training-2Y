import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter number of pens ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter number of Students ");
        int b = sc.nextInt();
        int c = a/b;
        int d = a%b;
        System.out.println("The Pen Per Student is "+c+" and the remaining pen not distributed is "+d);


    }
}
