package banking;

/**
 * Represents a bank account with basic operations such as deposit and withdrawal.
 */
public class Account {
    protected double balance;

    /**
     * Constructs an Account object with an initial balance.
     *
     * @param init_balance The initial amount of money in the account.
     */
    public Account(double init_balance) {
        balance = init_balance;
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance of the account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits a specified amount of money into the account.
     *
     * @param amt The amount of money to be deposited.
     * @return true indicating the deposit operation is successful.
     */
    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }

    /**
     * Attempts to withdraw a specified amount of money from the account.
     *
     * @param amt The amount of money to be withdrawn.
     * @return true if the withdrawal is successful (the account has sufficient balance),
     *         false otherwise.
     */
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else
            return false;
    }
}