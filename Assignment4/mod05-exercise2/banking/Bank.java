package banking;

// Compile and run the TestBanking program. You shoud see the following output:
// Customer [1] is Simms, Jane
// Customer [2] is Bryant, Owen
// Customer [3] is Soley, Tim
// Customer [4] is Soley, Maria

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String first_name, String last_name){
        Customer customer = new Customer(first_name,last_name);
        customers[numberOfCustomers] = customer;
        numberOfCustomers += 1;
    }
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

}
