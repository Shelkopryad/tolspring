package src.restful;

/**
 * Created by Svirin2-DA on 10.12.2018.
 */
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void add(double sum) {
        this.balance += sum;
    }

    public void sub(double sum) {
        if (sum <= this.balance) {
            this.balance -= sum;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
