package org.example.structuralPatterns.Bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Car car = new Sedan(new Kia());
        car.showDetails();

        System.out.println();

        Car car1 = new Sedan(new Skoda());
        car1.showDetails();

        System.out.println();

        Car car2 = new Hatchback(new Skoda());
        car2.showDetails();

        System.out.println();

        Car car3 = new Hatchback(new Mercedes());
        car3.showDetails();
    }
}

abstract class Car {
    Make make;
    public Car(Make make) {
        this.make = make;
    }

    abstract void showType();
    void showDetails() {
        showType();
        make.setMake();
    }
}

class Sedan extends Car {
    public Sedan(Make make) {
        super(make);
    }
    @Override
    void showType() {
        System.out.println("Sedan");
    }
}

class Hatchback extends Car {

    public Hatchback(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("Hatchback");
    }
}

interface Make {
    void setMake();
}

class Kia implements Make {

    @Override
    public void setMake() {
        System.out.println("Kia");
    }
}

class Mercedes implements Make {

    @Override
    public void setMake() {
        System.out.println("Mercedes");
    }
}
class Skoda implements Make {

    @Override
    public void setMake() {
        System.out.println("Skoda");
    }
}