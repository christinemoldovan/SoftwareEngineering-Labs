package moldovan.christine.lab8.ex4.units;

import moldovan.christine.lab8.ex4.Home;
import moldovan.christine.lab8.ex4.events.Event;
import moldovan.christine.lab8.ex4.events.FireEvent;
import moldovan.christine.lab8.ex4.events.TemperatureEvent;
import moldovan.christine.lab8.ex4.sensors.FireSensor;
import moldovan.christine.lab8.ex4.sensors.TemperatureSensor;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit extends Home implements Unit {
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    List<FireSensor> fireSensors = new ArrayList<>(4);
    HeatingUnit heatingUnit = new HeatingUnit();

    public ControlUnit() {
        for (int i = 0; i < 4; i++) {
            fireSensors.add(new FireSensor());
        }
    }

    @Override
    public void execute() {
        super.simulate();
    }

    @Override
    protected void setValueInEnvironment(Event event) {
        switch (event.getType()) {
            case FIRE:
                fireSensors.get(2).setFireStatus(((FireEvent) event).isSmoke());
                break;
            case TEMPERATURE:
        }
    }

    @Override
    protected void controlStep() {
        if (temperatureSensor.getValue() < 22) {
            heatingUnit.execute();
        } else {

        }

    }
}
