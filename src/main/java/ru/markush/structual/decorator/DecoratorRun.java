package ru.markush.structual.decorator;

public class DecoratorRun {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeDecorator decorator = new BallsTreeDecorator(tree);
        decorator.decorate();
    }
}
