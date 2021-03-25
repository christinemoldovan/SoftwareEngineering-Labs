package moldovan.christine.lab5.ex3;


public class TemperatureSensor extends Sensor {
    @Override
    public int readValue() {
        return Helper.randomRange();
    }
}
