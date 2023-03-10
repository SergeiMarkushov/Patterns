package ru.markush.structual.composite.expression;

public interface Expression {
    int eval();
    String asString();
    default void print() {
        System.out.println(asString() + " = " + eval());
    }
}
