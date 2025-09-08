import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double total=0.0;
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(true){
            double val = sc.nextDouble();
            if(val>0){
                arr[i]=val;
                total+=val;
                i++;
            }
            else{
                System.out.println(total);
                break;
            }
            if(i==10){
                break;
            }
        }
    }
}
