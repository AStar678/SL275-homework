package banking;

/**
 * Represents a checking account, which is a type of bank account.
 * This class extends the Account class and adds overdraft protection functionality.
 */
public class CheckingAccount extends Account {
    // The overdraft protection amount for this checking account.
    private double overdraftProtection;

    /**
     * Constructs a CheckingAccount object with an initial balance.
     * This constructor does not set any overdraft protection.
     *
     * @param balance The initial amount of money in the checking account.
     */
    public CheckingAccount(double balance) {
        // Call the constructor of the superclass (Account) to initialize the balance.
        super(balance);
    }

    /**
     * Constructs a CheckingAccount object with an initial balance and an overdraft protection amount.
     *
     * @param balance The initial amount of money in the checking account.
     * @param protect The amount of overdraft protection for this checking account.
     */
    public CheckingAccount(double balance, double protect) {
        // Call the constructor of the superclass (Account) to initialize the balance.
        super(balance);
        // Set the overdraft protection amount for this checking account.
        this.overdraftProtection = protect;
    }

    /**
     * Attempts to withdraw a specified amount of money from the checking account.
     * If the account has sufficient balance, the amount is simply deducted.
     * If there's not enough balance but the overdraft protection can cover the short - fall,
     * the overdraft protection is used and the balance is set to zero.
     * Otherwise, the withdrawal fails.
     *
     * @param amt The amount of money to be withdrawn.
     * @return true if the withdrawal is successful; false otherwise.
     */
    public boolean withdraw(double amt) {
        // Check if the account has enough balance to cover the withdrawal.
        if (amt < balance) {
            // Deduct the amount from the balance.
            balance -= amt;
            return true;
        } 
        // Check if the overdraft protection can cover the short - fall.
        else if (amt - balance < overdraftProtection) {
            // Use the overdraft protection to cover the short - fall.
            overdraftProtection -= (amt - balance);
            // Set the account balance to zero.
            balance = 0;
            return true;
        }
        // If neither condition is met, the withdrawal fails.
        else {
            return false;
        }
    }
}