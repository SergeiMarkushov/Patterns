package org.example.creationalPatterns.Builder;

public class BuilderApp {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .builderMake("Merc")
                .builderTransmission(Transmission.AUTO)
                .builderMaxSpeed(220)
                .build();

        System.out.println(car.toString());
    }
}

enum Transmission {
    MANUAL, AUTO
}
class Car {
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class CarBuilder {
    String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder builderMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder builderTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder builderMaxSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}
