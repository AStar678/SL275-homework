// Source code is decompiled from a .class file using FernFlower decompiler.
package banking.domain;

/**
 * Represents a basic bank account with balance management capabilities.
 * It provides methods to get the account balance, deposit money, and withdraw money.
 */
public class Account {
    // The current balance of the account.
    protected double balance;

    /**
     * Constructs an Account object with an initial balance.
     *
     * @param var1 The initial amount of money to be set as the account balance.
     */
    public Account(double var1) {
        this.balance = var1;
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance of the account.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Deposits a specified amount of money into the account.
     * The balance of the account will be increased by the given amount.
     *
     * @param var1 The amount of money to be deposited.
     * @return true indicating that the deposit operation is always successful.
     */
    public boolean deposit(double var1) {
        this.balance += var1;
        return true;
    }

    /**
     * Attempts to withdraw a specified amount of money from the account.
     * If the account has sufficient balance, the withdrawal will be successful
     * and the balance will be decreased by the given amount.
     *
     * @param var1 The amount of money to be withdrawn.
     * @return true if the withdrawal is successful (the account has sufficient balance);
     *         false otherwise.
     */
    public boolean withdraw(double var1) {
        if (var1 <= this.balance) {
            this.balance -= var1;
            return true;
        } else {
            return false;
        }
    }
}