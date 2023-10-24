import java.util.Date;
import java.util.ArrayList;

public class Account {
    private int id = 0;
    private static double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    private String name = "User";
    private ArrayList<Transaction> transaction = new ArrayList<Transaction>();
    
    Account(){this.dateCreated = new Date();}
    Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    Account(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }
    Account(String name, int id, int balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest()
    {
        double monthlyInterestRate = annualInterestRate/12;
        return balance*(monthlyInterestRate/100);
    }
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public int getId()
    {
        return this.id;
    }
    public Date getDate()
    {
        return this.dateCreated;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void withdraw(double monney)
    {
        if(balance >= monney)
        {
            balance -= monney;
            //System.out.println("Withdraw: " + monney);
            Transaction tran = new Transaction('D', monney, balance, "Deposit");
            transaction.add(tran);
        }
        else{System.out.println("The balance in the account is insufficient.");}
    }
    public void deposit(double monney)
    {
        balance += monney;
        //System.out.println("Deposit: " + monney);
        Transaction tran = new Transaction('D', monney, balance, "Deposit");
        transaction.add(tran);
    }
    public ArrayList getTransaction()
    {
        return transaction;
    }
    public void getData()
    {
        System.out.println("Your balance: $" + balance);
        System.out.println("monthly Interest: " + getMonthlyInterest() + " %");
        System.out.println("Date of account was created: " + dateCreated);
    }
}
