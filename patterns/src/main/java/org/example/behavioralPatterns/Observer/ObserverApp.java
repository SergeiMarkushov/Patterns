package main.java.org.example.behavioralPatterns.Observer;

import java.util.*;

public class ObserverApp {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());

        station.setMeasurements(25,760);

    }
}

interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer {
    void handleEvent(int temperature, int pressure);
}

class MeteoStation implements Observed {
    private int temperature;
    private int pressure;
    private List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(temperature, pressure);
        }
    }
}

class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("The weather is change! temperature: " + temperature + ", Pressure: " + pressure + ".");
    }
}