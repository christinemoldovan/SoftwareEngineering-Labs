package moldovan.christine.lab8.ex4;

import moldovan.christine.lab8.ex4.events.Event;
import moldovan.christine.lab8.ex4.events.FireEvent;
import moldovan.christine.lab8.ex4.events.NoEvent;
import moldovan.christine.lab8.ex4.events.TemperatureEvent;
import moldovan.christine.lab8.ex4.sensors.FireSensor;

import java.util.Random;

public abstract class Home {
    private Random r = new Random();
    private final int SIMULATION_STEPS = 20;

    protected abstract void setValueInEnvironment(Event event);
    protected abstract void controlStep();

    private Event getHomeEvent(){
        //randomly generate a new event;
        int k = r.nextInt(100);
        if(k<30)
            return new NoEvent();
        else if(k<60)
            return new FireEvent(r.nextBoolean());
        else
            return new TemperatureEvent(r.nextInt(50));
    }

    public void simulate(){
        int k = 0;
        while(k /**/<SIMULATION_STEPS){
            Event event = this.getHomeEvent();
            setValueInEnvironment(event);
            controlStep();
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            k++;
        }
    }
}
