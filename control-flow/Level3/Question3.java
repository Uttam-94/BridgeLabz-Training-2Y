import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter a physics mark: ");
        int physics = scanner.nextInt();
        System.out.print("Enter a chemistry mark: ");
        int chemistry = scanner.nextInt();  
        System.out.print("Enter a math mark: ");
        int math = scanner.nextInt();
        int total = physics + chemistry + math;
        double percentage = total / 3.0;
        if (percentage>=80){
            System.out.println("Grade A");
        }
        else if (percentage>=70 && percentage<79){
            System.out.println("Grade B");
        }
        else if (percentage>=60 && percentage<69){
            System.out.println("Grade C");
        }
        else if (percentage>=50 && percentage<59){
            System.out.println("Grade D");
        }
        else if (percentage>=40 && percentage<49){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade R");
        }
        scanner.close();
    }
}
