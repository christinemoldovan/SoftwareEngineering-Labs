package moldovan.christine.lab5.ex3;


public class Controller {
    LightSensor ls = new LightSensor();
    TemperatureSensor ts = new TemperatureSensor();

    public void control() {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ". Light sensor: " + ls.readValue() +
                    "  Temperature sensor: " + ts.readValue());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
