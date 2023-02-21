package ru.markush.structual.bridge;

public interface Paint {
    public void fill(Shape shape);

    public void stroke(Shape shape);

    public void drawPoint(int x, int y);
}
