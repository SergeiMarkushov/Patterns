package main.java.org.example.Delegate;

public class DelegatePattern {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Circle());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();

    }
}

interface Graphics{
    void draw();
}
class Triangle implements Graphics{
    @Override
    public void draw() {
        System.out.println("Triangle was drawn");
    }
}
class Square implements Graphics {

    @Override
    public void draw() {
        System.out.println("Square was drawn");
    }
}

class Circle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Circle was drawn");
    }
}

class Painter {
    Graphics graphics;

    void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    void draw() {
        graphics.draw();
    }
}