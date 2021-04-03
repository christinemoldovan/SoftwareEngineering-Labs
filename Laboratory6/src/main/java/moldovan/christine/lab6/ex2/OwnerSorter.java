package moldovan.christine.lab6.ex2;

import moldovan.christine.lab6.ex1.BankAccount;

import java.util.Comparator;

public class OwnerSorter implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return o1.getOwner().compareTo(o2.getOwner());
    }
}
