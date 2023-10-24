import java.util.ArrayList;

public class testAccount {
    public static void main(String args[])
    {
        CheckingAccount account1 = new CheckingAccount(0, 5000);
        System.out.println(account1.toString());
        account1.withdraw(10000);
        System.out.println("Balance is " + account1.getBalance());
        System.out.println("This account was created at " + account1.getDate());

        System.out.println("--------------------------------------------------------");

        SavingAccount account2 = new SavingAccount(1, 5000);
        System.out.println(account2.toString());
        account2.withdraw(10000);
        account2.withdraw(2000);
        System.out.println("Balance is " + account2.getBalance());
        System.out.println("This account was created at " + account2.getDate());

    } 
}
