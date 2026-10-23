package problem3.problem3after;
import java.lang.Override;

public class FixedTermAccount implements Account{
    protected double balance;
    public FixedTermAccount(double balance){
        this.balance=balance;
    }
    @Override
    public void deposit(double amount) { balance += amount; }
    @Override
    public double getBalance(){ return this.balance; }
}
