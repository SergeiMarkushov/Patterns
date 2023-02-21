package ru.markush.structual.decorator;

public class BallsTreeDecorator extends TreeDecorator{

    public BallsTreeDecorator(Tree tree) {
        super(tree);
    }

    @Override
    void decorate() {
        super.decorate();
        ballsDecorate();
    }

    private void ballsDecorate() {
        System.out.println("Decorate with balls ");
    }
}
