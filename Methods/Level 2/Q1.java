import java.util.Scanner;
public class Q1 {
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) factors[index++]=i;
        }
        return factors;
    }
    public static int sumFactors(int[] arr){
        int sum=0;
        for(int val:arr) sum+=val;
        return sum;
    }
    public static int productFactors(int[] arr){
        int prod=1;
        for(int val:arr) prod*=val;
        return prod;
    }
    public static int sumSquareFactors(int[] arr){
        int sum=0;
        for(int val:arr) sum+=Math.pow(val,2);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] factors=findFactors(n);
        System.out.print("Factors: ");
        for(int val:factors) System.out.print(val+" ");
        System.out.println();
        System.out.println("Sum: "+sumFactors(factors));
        System.out.println("Product: "+productFactors(factors));
        System.out.println("Sum of Squares: "+sumSquareFactors(factors));
    }
}
