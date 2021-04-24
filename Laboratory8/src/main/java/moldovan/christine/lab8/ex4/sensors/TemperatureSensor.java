package moldovan.christine.lab8.ex4.sensors;

import moldovan.christine.lab8.ex4.sensors.Sensor;

public class TemperatureSensor extends Sensor {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
