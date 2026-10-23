package problem3.problem3after;

public interface IsWithdrawable extends Account {
    boolean withdraw(double amount);
}

/*
Why is this design better?
StudentAccount can return false for amounts above 200,
while CurrentAccount can return false for insufficient funds.
Both respect the same contract: a withdrawal is an attempt
that may be refused according to account rules.
 */