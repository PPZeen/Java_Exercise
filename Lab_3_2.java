import java.util.Scanner;
import java.util.Arrays;

public class Lab_3_2 {
    public static void main(String[] args)
    {
        System.out.print("Enter list1: ");
        Scanner input = new Scanner(System.in);
        int[] list1 = new int[input.nextInt()];
        for(int i=0; i < list1.length; i++) {list1[i] = input.nextInt();}

        System.out.print("Enter list2: ");
        input = new Scanner(System.in);
        int[] list2 = new int[input.nextInt()];
        for(int i=0; i < list2.length; i++) {list2[i] = input.nextInt();}

        int[] list = new int[list1.length + list2.length];
        list = merge(list1, list2);

        System.out.print("The merged list is ");
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
    
    public static int[] merge(int[] list1, int[] list2)
    {
        int length1 = list1.length;
        int length2 = list2.length;
        int[] ans = new int[length1 + length2];
        System.arraycopy(list1, 0, ans, 0, length1);
        System.arraycopy(list2, 0, ans, length1, length2);
        Arrays.sort(ans);

        return ans;
    }
}