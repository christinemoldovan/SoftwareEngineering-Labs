package moldovan.christine.lab8.ex4;

public class FireSensor extends Sensor {
    private boolean fireStatus;
    AlarmUnit alarm = new AlarmUnit();
    GsmUnit gsm = new GsmUnit();

    public boolean isFireStatus() {
        return fireStatus;
    }

    @Override
    public void handleSituation(boolean smoke) {
        if(smoke==true){
            alarm.execute();
            gsm.execute();
        }
    }
}
