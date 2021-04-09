package moldovan.christine.lab7.ex1;

public class Coffee {
    private int temp;
    private int conc;
    private int number;

    Coffee(int t, int c, int nr) {
        temp = t;
        conc = c;
        number = nr;
    }

    int getTemp() {
        return temp;
    }

    int getConc() {
        return conc;
    }

    int getNumber() {
        return number;
    }

    public String toString() {
        return "[coffee temperature=" + temp + ":concentration=" + conc + " number of coffees:" + number + "]";
    }
}
