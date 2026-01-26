import java.util.*;
public class ReverseString {
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.hasNextLine()?sc.nextLine():"hello";
        System.out.println(reverse(input));
    }
}
