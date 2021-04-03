package moldovan.christine.lab6.ex1;

import java.util.Comparator;
import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {
    private double balance;
    private String owner;

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public BankAccount() {
    }

    public void withdraw(double amount) throws InsufficientFundException {
        longDatabaseCall();
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("New amount after withdraw: " + balance);
        } else {
            throw new InsufficientFundException();
        }
    }

    public void deposit(double amount) {
        longDatabaseCall();
        this.balance += amount;
        // System.out.println("New amount after deposit: " + balance);
    }

    private void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        BankAccount newObj = (BankAccount) obj;

        return Double.compare(newObj.balance, balance) == 0 && Objects.equals(owner, newObj.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }


    @Override
    public int compareTo(BankAccount o) {
        return (int) (this.getBalance() - o.getBalance());
    }
}
