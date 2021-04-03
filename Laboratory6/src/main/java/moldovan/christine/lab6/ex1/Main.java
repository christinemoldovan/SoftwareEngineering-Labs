package moldovan.christine.lab6.ex1;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(772.3, "George");
        BankAccount b2 = new BankAccount(123, "Zuzu");
        BankAccount b3 = new BankAccount(123.2, "Bella");
        try {
            b1.withdraw(649);
        } catch (InsufficientFundException e) {
            e.printStackTrace();
        }
        b2.deposit(200);
        System.out.println("New amount after deposit to " + b2.getOwner() + "'s account: " + b2.getBalance());
        System.out.println("Hash Codes for Bank Accounts:");
        System.out.println(b1.hashCode() + ", " + b2.hashCode());

        if (b3.equals(b2))
            System.out.println(b3.getOwner() + "'s balance equals " + b2.getOwner() + "'s balance");
        else System.out.println(b3.getOwner() + "'s balance doesn't equal " + b2.getOwner() + "'s balance");


    }
}
