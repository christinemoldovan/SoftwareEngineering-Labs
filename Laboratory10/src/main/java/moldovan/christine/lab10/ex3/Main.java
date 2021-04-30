package moldovan.christine.lab10.ex3;

public class Main extends Thread {
    public static void main(String[] args) {
        Counter1 c1 = new Counter1("1");
        Counter2 c2 = new Counter2("2");
        c1.start();
        try {
            c1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        c2.start();


    }
}
