package main.java.org.example.creationalPatterns.Builder;

public class FullBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder());

        Car car = director.buildCar();
        System.out.println(car);
    }
}

//class car and transmission in other class
abstract class FullCarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildBuildMake();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}

class FordMondeoBuilder extends FullCarBuilder {
    @Override
    void buildBuildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(250);
    }
}

class SubaruBuilder extends FullCarBuilder {
    @Override
    void buildBuildMake() {
        car.setMake("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(300);
    }
}

class Director {
    FullCarBuilder builder;

    void setBuilder(FullCarBuilder builder) {
        this.builder = builder;
    }
    Car buildCar() {
        builder.createCar();
        builder.buildBuildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}

