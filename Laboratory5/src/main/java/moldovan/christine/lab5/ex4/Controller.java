package moldovan.christine.lab5.ex4;

import moldovan.christine.lab5.ex3.LightSensor;
import moldovan.christine.lab5.ex3.TemperatureSensor;

public class Controller {
    private static Controller control;

    LightSensor ls = new LightSensor();
    TemperatureSensor ts = new TemperatureSensor();

    private Controller() {
    }

    public static Controller getController() {
        if (control == null) {
            control = new Controller();
            System.out.println("New controller created");
        }
        return control;
    }

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