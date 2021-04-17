package moldovan.christine.lab8.ex4;

abstract class Sensor {
    Sensor sensorType;

    public Sensor(){}

    public Sensor getSensorType() {
        return sensorType;
    }

    public void handleSituation(boolean status){}

}
