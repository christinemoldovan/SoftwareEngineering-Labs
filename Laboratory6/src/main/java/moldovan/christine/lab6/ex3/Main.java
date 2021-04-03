package moldovan.christine.lab6.ex3;


public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.addAccount("A", 122.2);
        b.addAccount("Z", 345.2);
        b.addAccount("Z", 35.2);
        System.out.println("Sort alphabetically:");
        b.printAccounts();
        System.out.println("Accounts between the specified range:");
        b.printAccounts(300, 400);

        System.out.println("All accounts:");
        b.getAllAccounts();
    }
}
