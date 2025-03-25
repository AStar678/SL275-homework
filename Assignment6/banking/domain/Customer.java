package banking.domain;

/**
 * Represents a customer in the banking system.
 * Each customer has a first name, a last name, and an associated account.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[10];
    private int NumOfAccounts = 0;

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

    //Modify the Customer class to handle the accounts association with generic multiplicity; 
    //just as you did for in exercise #2 in the Arrays module. It must include the public methods: 
    //addAccount(Account), getAccount(int), and getNumOfAccounts().

    public void addAccount(Account newAccount){
        accounts[NumOfAccounts] = newAccount;
        NumOfAccounts += 1;
    }

    public Account getAccount(int index){
        return accounts[index];
    }

    public int getNumOfAccounts(){
        return NumOfAccounts;
    }

}