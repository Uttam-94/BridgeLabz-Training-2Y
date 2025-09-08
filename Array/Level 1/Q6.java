import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        double[] arr = new double[11];
        double sum=0.0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            double val = sc.nextDouble();
            arr[i]=val;
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Mean is: "+sum/arr.length);
    }
}
