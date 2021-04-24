package moldovan.christine.lab8.ex4.sensors;


import moldovan.christine.lab8.ex4.units.AlarmUnit;
import moldovan.christine.lab8.ex4.units.GsmUnit;

public class FireSensor extends Sensor {
    private boolean fireStatus;

    public boolean isFireStatus() {
        return fireStatus;
    }



    public void setFireStatus(boolean fireStatus) {
        this.fireStatus = fireStatus;
    }
}
