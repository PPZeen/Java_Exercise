import java.util.Random;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args)
    {   
        Random rand = new Random();
        int[] list = new int[100];
        for(int i = 0; i < 100; i++) {
            list[i] = rand.nextInt(1000);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();
        input.close();
        
        try {
            System.out.printf("The value of index %d is %d.", index, list[index]);
        }
        catch(Exception e) {
            System.out.println("Array index out of length.");
        }
    }   
}