import java.util.Date;

public class Transaction extends Account{
    private Date date = new Date();
    private char type;

    private double amount;
    private double balance;
    private String description;


    Transaction(char type, double amount, double balance, String description)
    {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }
    public String toString()
    {
        return date + "\t" + type + "\t\t" + amount + "\t\t" + balance;
    }
    
}
