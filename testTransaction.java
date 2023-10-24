import java.util.ArrayList;

public class testTransaction {
    public static void main(String args[])
    {
        Account account = new Account("George", 1122, 1000);
        account.setAnnualInterestRate(1.65);
        System.out.println("Name: " + account.getName());
        System.out.println("Account ID: " + account.getId());
        System.out.println("Annual interest rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: %.2f\n",account.getBalance());

        account.deposit(30); account.deposit(40); account.deposit(50);
        account.withdraw(5); account.withdraw(4); account.withdraw(2);
        
        System.out.println("Date\t\t\t\tType\t\tAmount\t\tBalance");
        ArrayList<Transaction> tran = account.getTransaction();
        for(Transaction t: tran) System.out.println(t.toString());
             
    }
}
