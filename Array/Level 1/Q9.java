import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int val = sc.nextInt();
                arr[i][j]=val;
        }
        }
        int[] arr1= new int[arr.length*arr[0].length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[index]=arr[i][j];
                index++;
        }

    }
    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]);
    }
}
}