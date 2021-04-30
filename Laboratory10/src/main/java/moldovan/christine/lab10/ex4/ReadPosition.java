package moldovan.christine.lab10.ex4;

public class ReadPosition extends Thread {
    Robot r;

    public ReadPosition(Robot r) {
        this.r = r;
    }

    @Override
    public void run() {
        int i = 0;
        int a, b;
        while (++i < 2) {
            synchronized (r) {
                a = r.getX();
                b = r.getY();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println(getName() + ": Read position [" + a + "," + b + "]");
        }
    }
}
