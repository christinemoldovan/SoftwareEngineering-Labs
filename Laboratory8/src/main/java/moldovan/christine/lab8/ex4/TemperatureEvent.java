package moldovan.christine.lab8.ex4;

public class TemperatureEvent extends Event{
    private int value;

    TemperatureEvent(int value) {
        super(EventType.FIRE.TEMPERATURE);
        this.value = value;
    }

    int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TemperatureEvent{" + "value=" + value + '}';
    }
}
