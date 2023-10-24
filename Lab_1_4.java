import java.util.Scanner;

public class Lab_1_4 {
    public static void main(String[] args)
    {
        System.out.print("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble() * 0.45359237;
        input.close();

        System.out.print("Enter height in inches: ");
        input = new Scanner(System.in);
        double height = input.nextDouble() * 0.0254;
        input.close();
        
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("BMI is: %.4f", bmi);
    }    
}