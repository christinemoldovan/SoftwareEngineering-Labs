package moldovan.christine.lab6.ex3;

import moldovan.christine.lab6.ex1.BankAccount;
import moldovan.christine.lab6.ex2.OwnerSorter;


import java.util.Collections;
import java.util.TreeSet;

public class Bank {
    private TreeSet<BankAccount> accounts;


    public Bank() {
        accounts = new TreeSet<>();
    }

    public void addAccount(String owner, double balance) {
        BankAccount account = new BankAccount();
        account.deposit(balance);
        account.setOwner(owner);
        accounts.add(account);
    }

    public void printAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account.getOwner() + " " + account.getBalance());
        }
    }

    public void printAccounts(double min, double max) {
        int check = 0;
        for (BankAccount account : accounts) {
            if (account.getBalance() > min && account.getBalance() < max) {
                System.out.println(account.getOwner());
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("No accounts in the range [" + min + ", " + max + "].");
        }
    }

    //TODO sort alphabetically (another error)
    public BankAccount[] getAllAccounts() {

        if (accounts != null) {
            accounts.forEach(account -> {
                System.out.println(account.getOwner());
            });
            return accounts.toArray(BankAccount[]::new);
        }
        return new BankAccount[0];
    }


}
