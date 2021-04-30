package moldovan.christine.lab10.ex6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new ChronometerThread(new Chronometer()).start();
    }
}
