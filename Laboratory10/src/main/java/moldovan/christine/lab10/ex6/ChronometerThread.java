package moldovan.christine.lab10.ex6;

public class ChronometerThread extends Thread {
    Chronometer chronometer;

    public ChronometerThread(Chronometer chronometer) {
        this.chronometer = chronometer;
    }

    public void run() {
        while (true) {
            if (chronometer.isRunning) {
                chronometer.s++;
                if (chronometer.s == 60) {
                    chronometer.s = 0;
                    chronometer.m++;
                }
                if (chronometer.m == 60) {
                    chronometer.m = 0;
                    chronometer.h++;
                }
                chronometer.tf.setText(chronometer.h + " : " + chronometer.m + " : " + chronometer.s);
            } else {
                synchronized (chronometer) {
                    try {
                        chronometer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
