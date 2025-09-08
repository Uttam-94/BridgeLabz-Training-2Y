import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1= new int[3];
        int[] arr2= new int[3];
        System.out.println("Enter age");
        for(int i=0;i<arr1.length;i++){
            int a = sc.nextInt();
            arr1[i]=a;
        }

        System.out.println("Enter height");
        for(int i=0;i<arr1.length;i++){
            int a = sc.nextInt();
            arr2[i]=a;
        }
        int age=arr1[0];
        int height=0;
        for (int i=0;i<arr1.length;i++){
            if(age>=arr1[i]) {
                age=arr1[i];
            }
            if(arr2[i]>height) {
                height=arr2[i];
            }
        }
        System.out.println("Smallest age "+age);
        System.out.println("Largest height "+height);
    }

}