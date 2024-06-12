package main.java.org.example.structuralPatterns.Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FlyweightApp {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("point"));

        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x, y);
        }

    }
}

// flyweight
interface Shape {
    void draw(int x, int y);
}

//point flyweight
class Point implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") " + "draw point");
    }
}

//circle flyweight
class Circle implements Shape {
    private int r = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") " + "draw circle radius " + r);
    }
}

//Rectangle flyweight
class Square implements Shape {
    private int a = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") " + "draw Square with side  " + a);
    }
}

class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch(shapeName) {
                case "circle":
                    shape = new Circle();
                    break;
                case "point":
                    shape = new Point();
                    break;
                case "square":
                    shape = new Square();
                    break;
            }
            shapes.put(shapeName,shape);
        }
        return shape;
    }
}
