package problem3.problem3after;
import java.lang.Override;

public class CurrentAccount implements WithdrawableAccount{
    protected double balance;
    public CurrentAccount(double balance){
        this.balance=balance;
    }
    @Override
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
    @Override
    public double getBalance() { return balance; }
}
