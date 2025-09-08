import java.util.Scanner;
public class Question5 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a=a.toLowerCase();
        char[] b=a.toCharArray();
        int count=0,c=0;
        for(char element : b){
            if(element>='a' && element<='z'){
                if(element=='a' || element=='e' || element=='i' || element=='o' || element=='u' ){
                    count++;
                }
                else{c++;}
            }
        }
        System.out.println("Vowels are "+count);
        System.out.println("Consonants  are "+c);
    }
}
