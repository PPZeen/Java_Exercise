import java.util.Scanner;

public class Lab_2_4 {
    public static void main(String[] agrs)
    {
        System.out.print("Enter the first city: ");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        int one = first.charAt(0);
        
        System.out.print("Enter the second city: ");
        input = new Scanner(System.in);
        String second = input.nextLine();
        int two = second.charAt(0);

        System.out.print("Enter the third city: ");
        input = new Scanner(System.in);
        String third = input.nextLine();
        int three = third.charAt(0);

        String ans1, ans2, ans3;
        if (one > two)
        {
            if(one > three)
            {
                if(two > three){ans1 = first; ans2 = second; ans3 = third;}
                else {ans1 = first; ans2 = third; ans3 = second;}
            }
            else{ans1 = third; ans2 = first; ans3 = second;}
        }
        else
        {
            if(two > three)
            {
                if(one > three){ans1 = second; ans2 = first; ans3 = third;}
                else {ans1 = second; ans2 = third; ans3 = first;}
            }
            else{ans1 = third; ans2 = second; ans3 = first;}
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s", ans3, ans2, ans1);
    }
}
