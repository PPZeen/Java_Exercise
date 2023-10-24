import java.util.Scanner;

public class ATM_matchine {
    public static void main(String args[])
    {
        int youId = 0;
        boolean check = false;
        boolean end = false;
        
        int[][] ids = {{0,100}, {1,100}, {2,100},{3,100}, {4,100}, {5,100},
                      {6,100}, {7,100}, {8,100}, {9,100}};
        while(!check)
        {
            youId = login();
            for(int i = 0; i < ids.length; i++)
            {
                if(youId == ids[i][0]){check = true; break;}
            }
            if(!check){System.out.println("Can't find your id.");}
        }

        while(!end)
        {
            int choice = menu();
            if(choice == 1){System.out.println("The balance is " + ids[youId][1]);}
            else if(choice == 2)
            {
                System.out.print("Enter an amount to withdraw: ");
                Scanner input = new Scanner(System.in);
                ids[youId][1] -= input.nextDouble();
                input.close();
            }
            else if(choice == 3)
            {
                System.out.print("Enter an amount to  deposit: ");
                Scanner input = new Scanner(System.in);
                ids[youId][1] += input.nextDouble();
                input.close();
            }
            else if(choice == 4){System.out.println("End of Program."); end = true;}

            System.out.println(" ");
        }
    }
    public static int login()
    {
        System.out.print("Enter an id: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        input.close();

        return id;
    }

    public static int menu()
    {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");

        System.out.print("Enter a choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.close();

        return choice;
    }
}
