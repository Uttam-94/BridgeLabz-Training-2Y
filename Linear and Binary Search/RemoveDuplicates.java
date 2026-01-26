import java.util.*;
public class RemoveDuplicates {
    public static String remove(String s){
        boolean[] seen=new boolean[256];
        StringBuilder out=new StringBuilder();
        for(char c: s.toCharArray()){
            if(!seen[c]){
                out.append(c);
                seen[c]=true;
            }
        }
        return out.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.hasNextLine()?sc.nextLine():"banana";
        System.out.println(remove(input));
    }
}
