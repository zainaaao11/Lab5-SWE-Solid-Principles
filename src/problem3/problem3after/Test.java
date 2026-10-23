package problem3.problem3after;

import java.util.ArrayList;
import java.util.List;

public class Test {
     static void main(String[] args){
        CurrentAccount current = new CurrentAccount(500);
        FixedTermAccount fixed = new FixedTermAccount(1000);
        List<WithdrawableAccount> accounts = new ArrayList<>();
        accounts.add(current);
       //accounts.add(fixed); //compile-time error
        Bank.chargeMonthlyFee(accounts);
        System.out.println("Current account balance: " + current.getBalance());
        System.out.println("Fixed-term account balance: " + fixed.getBalance());
    }
}