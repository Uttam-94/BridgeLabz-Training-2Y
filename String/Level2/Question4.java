
import java.util.Scanner;
import java.util.Arrays;
public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        String[] b=a.split(" ");
        int min=100,max=0;
        for(String element : b){
            if(element.length()<min){
                min=element.length();
            }
            if(element.length()>max){
                max=element.length();
            }
        }
        for(String element : b){
            if(element.length()==max){
                System.out.println("Max length is "+element);
            }
            if(element.length()==min){
                System.out.println("Min length is "+element);
            }
        }
    }
}
