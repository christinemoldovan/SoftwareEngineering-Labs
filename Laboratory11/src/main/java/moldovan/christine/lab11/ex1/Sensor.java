package moldovan.christine.lab11.ex1;

import static java.lang.Thread.sleep;

public class Sensor extends Observable implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (++i < 10) {
            int a = (int) Math.round(100 * Math.random());
            this.changeState(a);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             System.out.println("Read position [" + a + "]");
        }
    }
}
