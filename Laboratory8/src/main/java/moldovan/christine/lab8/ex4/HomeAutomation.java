package moldovan.christine.lab8.ex4;

import moldovan.christine.lab8.ex4.events.Event;
import moldovan.christine.lab8.ex4.units.ControlUnit;
import moldovan.christine.lab8.ex4.units.Unit;

public class HomeAutomation {
    public static void main(String[] args) {
        Unit controlUnit = new ControlUnit();
        controlUnit.execute();
    }
}
