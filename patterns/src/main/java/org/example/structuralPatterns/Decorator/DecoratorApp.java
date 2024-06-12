package org.example.structuralPatterns.Decorator;

import java.lang.reflect.ParameterizedType;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer("Hi");
        printer.print();

        System.out.println();

        QuotesDecorator decorator = new QuotesDecorator(printer);
        decorator.print();

        System.out.println();

        PrinterInterface decorator1 = new LeftBracketDecorator(decorator);
        decorator1.print();

        System.out.println();

        PrinterInterface decorator2 = new RightBracketDecorator(decorator1);
        decorator2.print();
    }
}

interface PrinterInterface {
    void print();
}

class Printer implements PrinterInterface {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

abstract class Decorator implements PrinterInterface {
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}

class QuotesDecorator extends Decorator {
    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}

class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}

class RightBracketDecorator extends Decorator {

    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}