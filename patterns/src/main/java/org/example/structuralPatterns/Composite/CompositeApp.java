package main.java.org.example.structuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square  = new Square();

        Composite composite = new Composite();

        composite.addComponent(triangle);
        composite.addComponent(circle);
        composite.addComponent(square);

        composite.draw();

        System.out.println();

        Shape triangle1 = new Triangle();
        Shape circle1 = new Circle();
        Shape square1  = new Square();

        Composite composite1 = new Composite();

        composite1.addComponent(triangle1);
        composite1.addComponent(circle1);
        composite1.addComponent(square1);
        composite1.addComponent(composite);

        composite1.draw();

    }
}
interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component : components) {
            component.draw();
        }
    }
}