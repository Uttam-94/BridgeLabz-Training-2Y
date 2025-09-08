import java.util.Scanner;
public class Q9 {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt();
        int children=sc.nextInt();
        int[] result=findRemainderAndQuotient(chocolates,children);
        System.out.println("Each child gets: "+result[0]+" chocolates, Remaining chocolates: "+result[1]);
    }
}
