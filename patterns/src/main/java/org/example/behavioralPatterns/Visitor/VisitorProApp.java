package org.example.behavioralPatterns.Visitor;

public class VisitorProApp {
    public static void main(String[] args) {
        ElementPro car = new CarElement();
        VisitorPro user = new UserVisitor();
        VisitorPro mechanic = new MechanicProVisitor();

        car.accept(user);
        System.out.println();

        car.accept(mechanic);

    }
}

interface VisitorPro {
    void visit(EngineElementPro engine);
    void visit(BodyElementPro body);
    void visit(CarElement car);
    void visit(WheelElement wheel);
}

interface ElementPro {
    void accept(VisitorPro visitor);
}

// колесо
class WheelElement implements ElementPro {
    private String name;

    public WheelElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(VisitorPro visitor) {
        visitor.visit(this);
    }
}

// двигатель
class EngineElementPro implements ElementPro {

    @Override
    public void accept(VisitorPro visitor) {
        visitor.visit(this);
    }
}

// кузов
class BodyElementPro implements ElementPro {

    @Override
    public void accept(VisitorPro visitor) {
        visitor.visit(this);
    }
}

// автомобиль
class CarElement implements ElementPro {
    ElementPro[] elements;

    public CarElement() {
        this.elements = new ElementPro[] {
                new WheelElement("front right wheel"),
                new WheelElement("front left wheel"),
                new WheelElement("back left wheel"),
                new WheelElement("back left wheel"),
                new BodyElementPro(),
                new EngineElementPro()
        };
    }

    @Override
    public void accept(VisitorPro visitor) {
        for (ElementPro element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}

class UserVisitor implements VisitorPro {
    @Override
    public void visit(EngineElementPro engine) {
        System.out.println("Run the engine");
    }

    @Override
    public void visit(BodyElementPro body) {
        System.out.println("Bite the body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smoke inside");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Bite the " + wheel.getName());
    }
}

class MechanicProVisitor implements VisitorPro {
    @Override
    public void visit(EngineElementPro engine) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(BodyElementPro body) {
        System.out.println("Polish the body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Check all car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Blow the " + wheel.getName());
    }
}

