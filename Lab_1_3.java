import java.util.Scanner;

public class Lab_1_3{
    public static void main(String[] args)
    {
        System.out.print("Enter a number between 0 and 1000: ");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            
            System.out.print(num/100 + (num/10)%10 + num%10);
        }
    }
}
