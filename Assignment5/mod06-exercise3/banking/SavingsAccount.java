package banking;

/**
 * Represents a savings account which is a type of bank account.
 * It inherits from the Account class and has an additional interest rate property.
 */
public class SavingsAccount extends Account{
    // The interest rate of the savings account
    private double interestRate;

    /**
     * Constructs a SavingsAccount object with an initial balance and an interest rate.
     *
     * @param balance The initial amount of money in the savings account.
     * @param interest_rate The interest rate associated with the savings account.
     */
    public SavingsAccount(double balance, double interest_rate){
        // Call the constructor of the superclass (Account) to initialize the balance
        super(balance);
        // Initialize the interest rate of the savings account
        interestRate = interest_rate;
    }
}