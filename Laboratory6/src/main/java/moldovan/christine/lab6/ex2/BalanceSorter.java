package moldovan.christine.lab6.ex2;

import moldovan.christine.lab6.ex1.BankAccount;

import java.util.Comparator;

public class BalanceSorter implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return Double.compare(o1.getBalance(), o2.getBalance());
    }
}
