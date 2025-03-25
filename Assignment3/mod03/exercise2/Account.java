package mod03.exercise2;

public class Account {
    double balance;
    
    public Account(double init_balance){
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw(double amt){
        balance -= amt;
    }
}
