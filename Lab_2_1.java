import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] agrs)
    {
        System.out.print("Enter today's day: ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        input.close();

        System.out.print("Enter the number of days elapsed since today: ");
        input = new Scanner(System.in);
        int nextDay = input.nextInt();
        input.close();
        
        int futureDay = (day+nextDay)%7;
        String Day[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
        
        System.out.printf("Today is %s and the future day is %s", Day[day], Day[futureDay]);
    }
}
