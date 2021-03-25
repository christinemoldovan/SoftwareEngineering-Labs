package moldovan.christine.lab5.ex3;

public class LightSensor extends Sensor {
    // key your code dry -- Don't Repeat Yourself
    @Override
    public int readValue() {
        return Helper.randomRange();
    }
}
