package banking;

/**
 * Represents a customer in the banking system.
 * Each customer has a first name, a last name, and an associated account.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.savingsAccount = null;
        this.checkingAccount = null;
    }

    public void setChecking(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public void setSavings(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public CheckingAccount getChecking() {
        return checkingAccount;
    }

    public SavingsAccount getSavings() {
        return savingsAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}