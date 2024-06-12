package main.java.org.example.behavioralPatterns.Visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();

        Visitor hooligan = new HooliganVisitor();
        Visitor mechanic = new MechanicVisitor();


        body.accept(hooligan); // кузов принимай хулигана
        engine.accept(hooligan); // двигатель принимай хулигана

        System.out.println();

        body.accept(mechanic); // пустим механика к кузову
        engine.accept(mechanic); // пустим механика к двигателю
    }
}

// visitor
interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}

//элемент - Автозапчасть
interface Element {
    void accept(Visitor visitor);
}

// двигатель
class EngineElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// кузов
class BodyElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class HooliganVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Engine in on");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Knock the body");
    }
}

class MechanicVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Check engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("polish the body");
    }
}