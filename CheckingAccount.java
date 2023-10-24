public class CheckingAccount extends Account
{
    CheckingAccount()
    {
        super();
    }
    CheckingAccount(int id, double balance)
    {
        super(id, balance);
    }
    public String toString()
    {
        return "Checking Account\n" + "Overdraft Limit: " + super.getBalance() + "\n" + "Balance is " + super.getBalance();
    }
    public void withdraw(double amount)
    {
        double monney = super.getBalance();
        monney -= amount;
        super.setBalance(monney);
        System.out.println("Withdraw: " + amount);
    }
}
