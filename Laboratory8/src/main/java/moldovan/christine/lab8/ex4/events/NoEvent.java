package moldovan.christine.lab8.ex4.events;

import moldovan.christine.lab8.ex4.events.Event;
import moldovan.christine.lab8.ex4.events.EventType;

public class NoEvent extends Event {
    public NoEvent() {
        super(EventType.NONE);
    }

    @Override
    public String toString() {
        return "NoEvent{}";
    }
}
