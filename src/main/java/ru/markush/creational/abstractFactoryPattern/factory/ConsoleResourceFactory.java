package ru.markush.creational.abstractFactoryPattern.factory;

import java.util.Arrays;

public class ConsoleResourceFactory implements ResourceFactory{

    @Override
    public WritableResource getResource() {
        return args -> {
            Arrays.stream(args).forEach(arg -> System.out.print(arg + " "));
        };
    }
}
