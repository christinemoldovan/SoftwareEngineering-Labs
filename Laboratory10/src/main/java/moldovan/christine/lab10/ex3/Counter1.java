package moldovan.christine.lab10.ex3;

public class Counter1 extends Thread {
    Counter1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            System.out.println(getName() + " i = " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
