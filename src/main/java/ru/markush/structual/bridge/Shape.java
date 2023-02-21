package ru.markush.structual.bridge;

public class Shape {
    protected Shape(Paint paint) {
        this.paint = paint;
    }
    private final Paint paint;
    public void fill() {
        getPaint().fill(this);
    }

    public Paint getPaint() {
        return paint;
    }
}
