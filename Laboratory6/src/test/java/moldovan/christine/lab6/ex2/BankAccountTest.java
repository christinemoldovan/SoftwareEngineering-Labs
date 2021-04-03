package moldovan.christine.lab6.ex2;

import moldovan.christine.lab6.ex1.BankAccount;
import moldovan.christine.lab6.ex1.InsufficientFundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void BankAccountTest() {
        BankAccount b1 = new BankAccount(772.3, "George");
        BankAccount b2 = new BankAccount(123, "Zuzu");
        BankAccount b3 = new BankAccount(123.2, "Bella");
        assertEquals("George", b1.getOwner());
        assertEquals(772.3, b1.getBalance());
        try {
            b1.withdraw(649);
        } catch (InsufficientFundException e) {
            e.printStackTrace();
        }

        assertEquals(123.29, b1.getBalance(), 0.01);

        b2.deposit(200);
        assertEquals(323, b2.getBalance());

        b3.setOwner("Pufi");
        assertEquals("Pufi", b3.getOwner());


    }
}
