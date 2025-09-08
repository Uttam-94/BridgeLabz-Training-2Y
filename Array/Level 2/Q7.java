import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n=sc.nextInt();

        double[][] personData=new double[n][3]; 
        String[] weightStatus=new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter details for person "+(i+1)+":");

            double weight,height;
            do{
                System.out.print("Weight (kg): ");
                weight=sc.nextDouble();
            }while(weight<=0);

            do{
                System.out.print("Height (m): ");
                height=sc.nextDouble();
            }while(height<=0);

            double bmi=weight/(height*height);

            personData[i][0]=height;
            personData[i][1]=weight;
            personData[i][2]=bmi;

            if(bmi<=18.4) weightStatus[i]="Underweight";
            else if(bmi<=24.9) weightStatus[i]="Normal";
            else if(bmi<=39.9) weightStatus[i]="Overweight";
            else weightStatus[i]="Obese";
        }

        System.out.println("\nResults:");
        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");
        for(int i=0;i<n;i++){
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                personData[i][0],personData[i][1],personData[i][2],weightStatus[i]);
        }

        sc.close();
    }
}
