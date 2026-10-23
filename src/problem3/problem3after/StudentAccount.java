package problem3.problem3after;
import java.lang.Override;

class StudentAccount extends CurrentAccount {
    private double balance;
    public StudentAccount(double balance){
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 200)
            throw new IllegalArgumentException();
        super.withdraw(amount);
    }
}
/*
This design violates LSP because CurrentAccount allows to
withdraw an amount above 200 if there is enough balance, while StudentAccount
refuses it. The subclass therefore strengthens the precondition:
CurrentAccount:
amount <= balance
StudentAccount:
amount <= balance AND amount <= 200
Thus, StudentAccount is not safely substitutable for CurrentAccount
For an alternative better design, check the IsWithdrawable.java file
 */