import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] agrs)
    {
        String days[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        System.out.print("Enter year: (e.g., 2012): ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();
        
        System.out.print("Enter month: 1-12: ");
        input = new Scanner(System.in);
        int month = input.nextInt();
        input.close();
        if (month < 3){month += 12; year -= 1;}

        System.out.print("Enter the day of the mouth: 1-31: ");
        input = new Scanner(System.in);
        int day = input.nextInt();
        input.close();
        
        int k = year%100;
        int j = year/100;
        int h = (day + ((26*(month+1))/10) + k + (k/4) + (j/4) + 5*j)%7; 

        System.out.printf("Day of the week is %s", days[h]);
    }
}
