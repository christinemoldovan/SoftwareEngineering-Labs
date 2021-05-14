package moldovan.christine.lab11.ex1;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<moldovan.christine.lab11.ex1.Observer> observers = new ArrayList<moldovan.christine.lab11.ex1.Observer>();

    public void changeState(Object event) {
        notifyAllObservers(event);
    }

    public void register(moldovan.christine.lab11.ex1.Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(Object event){
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
