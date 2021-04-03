package moldovan.christine.lab6.ex1;

public class InsufficientFundException extends Exception {
    public InsufficientFundException() {
        super("Not enough money in your account");
    }
}