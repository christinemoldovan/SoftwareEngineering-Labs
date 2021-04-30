package moldovan.christine.lab10.ex4;


public class WritePosition extends Thread {
    Robot r;

    public WritePosition(Robot r) {
        this.r = r;
    }

    @Override
    public void run() {
        int i = 0;
        while (++i < 2) {
            int a = (int) Math.round(1 * Math.random());
            int b = (int) Math.round(1 * Math.random());
            synchronized (r) {
                r.setXY(a, b);
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println(getName() + ": Write position [" + a + "," + b + "]");
        }
    }
}
