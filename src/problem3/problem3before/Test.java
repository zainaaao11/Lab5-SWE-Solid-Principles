package problem3.problem3before;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(500);
        FixedTermAccount fixed = new FixedTermAccount(1000);
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(fixed);
        Bank.chargeMonthlyFee(accounts);
        System.out.println("Account balance: " + account.getBalance());
        System.out.println("Fixed-term account balance: " + fixed.getBalance());
    }
}

//Analyzing the class before fixing the principles
/*
1)With the original design, Account(500) is charged successfully and becomes 490.
When the loop reaches FixedTermAccount(1000), withdraw(10) calls its overridden method and throws
UnsupportedOperationException("Locked until maturity").Thus, the program crushes during chargeMonthlyFee().

2)In the real world, a fixed-term account is a bank account. But in the code,
Account promises that withdraw() is available, while FixedTermAccount refuses every withdrawal.
Therefore, a FixedTermAccount cannot safely replace an Account, so LSP is violated.

3)LSP says a subtype must respect the parent contract:
-It must not strengthen preconditions.
-It must not weaken postconditions.
-It must preserve expected invariants/behavior.
-It should not introduce unexpected exceptions for valid parent operations.
FixedTermAccount breaks this because a valid withdraw() on Account becomes
impossible and throws UnsupportedOperationException

4)the fix avoids the crash but violates the Open/Closed Principle. Bank now depends on concrete account types.
If another non-withdrawable account appears, Bank must be modified again

*/