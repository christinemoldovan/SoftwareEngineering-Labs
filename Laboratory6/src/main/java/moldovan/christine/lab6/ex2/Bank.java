package moldovan.christine.lab6.ex2;

import moldovan.christine.lab6.ex1.BankAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;


public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(String owner, double balance) {
        BankAccount account = new BankAccount();
        account.deposit(balance);
        account.setOwner(owner);
        accounts.add(account);
    }

    public void printAccounts() {
        accounts.sort(new BalanceSorter());
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


  /*  public void getAllAccounts() {
        accounts.sort(new OwnerSorter());
        for (BankAccount account : accounts) {
            System.out.println(account.getOwner() + " " + account.getBalance());
        }
    }*/

    public BankAccount[] getAllAccounts() {
        accounts.sort(new OwnerSorter());
        if (accounts != null) {
            accounts.forEach(account -> {
                System.out.println(account.getOwner());
            });
            return accounts.toArray(BankAccount[]::new);
        }
        return new BankAccount[0];
    }

    //TODO repair the error
    public BankAccount getAccount(String owner) {
        return (accounts.stream()
                .filter(account -> Objects.equals(account.getOwner(), owner))
                .findFirst()
                .orElse(null));
    }


}
