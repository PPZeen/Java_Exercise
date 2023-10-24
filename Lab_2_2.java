import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] agrs)
    {
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        int rand = (int)(Math.random() * 3);
        if(rand == 0)
        {
            System.out.print("The computer is scissor. ");
            if(num == 0){System.out.print("You are scissor too. It is a draw");}
            else if(num == 1){System.out.print("You are rock. You won");}
            else if(num == 2){System.out.print("You are paper. You lose.");}
        }
        else if(rand == 1)
        {
            System.out.print("The computer is rock. ");
            if(num == 0){System.out.print("You are scissor. You lose.");}
            else if(num == 1){System.out.print("You are rock too. It is a draw");}
            else if(num == 2){System.out.print("You are paper. You won.");}
        }
        else if(rand == 2)
        {
            System.out.print("The computer is paper. ");
            if(num == 0){System.out.print("You are scissor. You won.");}
            else if(num == 1){System.out.print("You are rock. You lose.");}
            else if(num == 2){System.out.print("You are paper too. It is a draw");}
        }
    }
}