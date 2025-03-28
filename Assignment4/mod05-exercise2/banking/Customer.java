package banking;

/**
 * Represents a customer in the banking system.
 * Each customer has a first name, a last name, and an associated account.
 */
public class Customer {
    String firstName;
    String lastName;
    Account account;

    /**
     * Constructs a new Customer object with the given first and last names.
     *
     * @param f The first name of the customer.
     * @param l The last name of the customer.
     */
    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }

    /**
     * Retrieves the first name of the customer.
     *
     * @return The first name of the customer.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the customer.
     *
     * @return The last name of the customer.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the account associated with the customer.
     *
     * @return The account of the customer.
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the account for the customer.
     *
     * @param account The account to be associated with the customer.
     */
    public void setAccount(Account account) {
        this.account = account;
    }

}