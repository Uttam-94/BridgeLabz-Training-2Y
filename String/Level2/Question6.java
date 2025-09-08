import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a=a.toLowerCase();
        char[] b=a.toCharArray();
        int count=0,c=0;
        for(char element : b){
            if(!(element>='a' && element<='z')){System.out.println(element+" is not a character");
            }
            if(element>='a' && element<='z'){
                if(element=='a' || element=='e' || element=='i' || element=='o' || element=='u' ){
                    System.out.println(element +" is a vowel");
                }
                else{System.out.println(element+ " is a consonant");}
            }
    }
        
    }
}
