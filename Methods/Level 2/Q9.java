import java.util.Scanner;
public class Q9 {
    public static boolean isPositive(int n){
        return n>=0;
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static int compare(int a,int b){
        if(a>b) return 1;
        if(a==b) return 0;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        for(int i=0;i<5;i++){
            if(isPositive(arr[i])){
                if(isEven(arr[i])) System.out.println(arr[i]+" is Positive and Even");
                else System.out.println(arr[i]+" is Positive and Odd");
            } else System.out.println(arr[i]+" is Negative");
        }
        int result=compare(arr[0],arr[4]);
        if(result==1) System.out.println("First element is greater than last element");
        else if(result==0) System.out.println("First element is equal to last element");
        else System.out.println("First element is less than last element");
    }
}
