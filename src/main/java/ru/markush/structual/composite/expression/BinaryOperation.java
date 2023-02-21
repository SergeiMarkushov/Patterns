package ru.markush.structual.composite.expression;

public interface BinaryOperation {
    int apply(Expression left, Expression right);
}
