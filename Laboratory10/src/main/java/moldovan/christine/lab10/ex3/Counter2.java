package moldovan.christine.lab10.ex3;

public class Counter2 extends Thread {
    Counter2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 101; i < 201; i++) {
            System.out.println(getName() + " i = " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
