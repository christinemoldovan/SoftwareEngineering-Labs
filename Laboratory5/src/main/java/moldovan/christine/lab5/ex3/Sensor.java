package moldovan.christine.lab5.ex3;

public abstract class Sensor {
    private String location;

    abstract int readValue();

    public String getLocation() {
        return location;
    }
}
