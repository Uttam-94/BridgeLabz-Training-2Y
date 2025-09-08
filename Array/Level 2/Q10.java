import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number=sc.nextLong();
        String numStr=Long.toString(number);
        int count=numStr.length();
        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=numStr.charAt(i)-'0'; 
        }
        int[] freq=new int[10];
        for(int i=0;i<count;i++){
            freq[digits[i]]++;
        }
        System.out.println("Digit\tFrequency");
        for(int i=0;i<10;i++){
            if(freq[i]>0){
                System.out.println(i+"\t"+freq[i]);
            }
        }
    }
}
