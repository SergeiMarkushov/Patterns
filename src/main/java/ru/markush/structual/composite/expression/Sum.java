package ru.markush.structual.composite.expression;

public class Sum extends BinaryExpression {
    public Sum(Expression left, Expression right) {
        super(left, right, (l, r) -> l.eval() + r.eval());
    }

    @Override
    public String asString() {
        return String.format("(%s + %s)", getLeft().asString(), getRight().asString());
    }
}
