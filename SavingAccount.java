public class SavingAccount extends Account{
    SavingAccount()
    {
        super();
    }
    SavingAccount(int id, double balance)
    {
        super(id, balance);
    }

    public String toString() {
        return "Saving Account\n" + "Balance is " + super.getBalance();
    }
}
