import java.util.Arrays;
import java.util.Scanner;

public class Question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        String[] b=a.split(" ");
        for(String element : b){
            System.out.println(element);
        }
    }
    
}
