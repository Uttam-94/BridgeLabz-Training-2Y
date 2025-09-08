import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Scanner sc = new Scanner(System.in);
        int count=0;
        for(int i=0;i<arr.length;i++){
            int val = sc.nextInt();
            if(val>0){
                if(val%2==0){
                    arr[i]="Even";
                }
                else{
                    arr[i]="Odd";
                }
                count++;
            }
            else{
                break;
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
    }
}
