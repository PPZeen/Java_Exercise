import java.util.Scanner;

class Main {  
    public static void main(String[] args)
    {
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while(num != 0)
        {
            if(num < 10){case1();}
            else if(num < 20){case2();}
            else {case3();}

            System.out.print("Enter number: ");
            input = new Scanner(System.in);
            num = input.nextInt();
        }
        System.out.print("finish processing");
    }

    static void case1()
    {
        System.out.println("numbers less than 10");
    }
    static void case2()
    {
        System.out.println("numbers greater than 10, but less than 20");
    } 
    static void case3()
    {
        System.out.println("number greater than 20");
    } 
}
