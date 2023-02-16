package ru.markush.creational.abstractFactoryPattern.runCode;

import ru.markush.creational.abstractFactoryPattern.factory.*;
import ru.markush.creational.abstractFactoryPattern.factory_method.Pair;

import java.io.IOException;


public class AbstractFactoryTest {

    private static void createAnimalSay(AnimalFactory animalFactory){
        animalFactory.getAnimal().say();
    }

    public static void main(String[] args) throws IOException {
        createAnimalSay(new DogFactory());
        createAnimalSay(new CatFactory());

        Logger logger = new Logger(new ConsoleResourceFactory());
        logger.log("Hello World");

        logger = new Logger(new FoleResourceFactory("out.txt"));
        logger.log("Hello World");

        Pair<String, Integer> pair = Pair.of("Hello", 2);
        String left = pair.getLeft();
        Integer right = pair.getRight();


    }
}
