import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 ");
        float number1 = sc.nextFloat();
        System.out.println("Enter number2");
        float number2 = sc.nextFloat();
        int add=(int)number1+(int)number2;
        int sub=(int)number1-(int)number2;
        int mult=(int)number1*(int)number2;
        float div=number1/number2;
        System.out.println("Addition is "+add+" subtraction is "+sub+" multiplication is "+mult+" divison is "+ div);
}
}