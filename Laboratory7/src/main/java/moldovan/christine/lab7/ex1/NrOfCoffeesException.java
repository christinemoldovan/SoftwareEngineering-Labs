package moldovan.christine.lab7.ex1;

public class NrOfCoffeesException extends Exception {
    int nr;

    public NrOfCoffeesException(int nr, String msg) {
        super(msg);
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }
}
