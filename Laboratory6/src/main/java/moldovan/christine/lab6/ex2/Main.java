package moldovan.christine.lab6.ex2;

import moldovan.christine.lab6.ex1.BankAccount;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /*BankAccount b1 = new BankAccount(772.3, "George");
        BankAccount b2 = new BankAccount(123, "Zuzu");
        BankAccount b3 = new BankAccount(123.2, "Bella");
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);
        Iterator itr = accounts.iterator();
        while (itr.hasNext()) {
            BankAccount b = (BankAccount) itr.next();
            System.out.println(b.getOwner() + " " + b.getBalance());
        }*/

        Bank b = new Bank();
        b.addAccount("Lola", 233.4);
        b.addAccount("Ozzy", 700.5);
        b.addAccount("Zofi", 120.7);
        System.out.println("Account(s) between the specified range:");
        b.printAccounts(233, 700);

        System.out.println("Sorted by balance:");
        b.printAccounts();

        System.out.println("Sorted by name all accounts:");
        b.getAllAccounts();


        System.out.println("Get account:");
        System.out.println(b.getAccount("Lola"));

    }


}
