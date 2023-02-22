package ru.markush.behavioral.listener;

public class Event {
    private final Object data;

    public Event(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Event{" +
                "data=" + data +
                '}';
    }
}
