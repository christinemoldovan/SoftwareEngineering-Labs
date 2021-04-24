package moldovan.christine.lab8.ex4.events;

import moldovan.christine.lab8.ex4.events.EventType;

public abstract class Event {
    EventType type;

    Event(EventType type) {
        this.type = type;
    }

   public  EventType getType() {
        return type;
    }
}
