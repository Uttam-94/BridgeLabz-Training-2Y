import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost price");
        float cp = sc.nextFloat();
        System.out.println("Enter selling price");
        float sp = sc.nextFloat();
        float profit = sp -cp;
        float profitpercent = (profit/cp)*100;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\nThe Profit is INR "+profit +" and the Profit Percentage is "+profitpercent);
    }
}