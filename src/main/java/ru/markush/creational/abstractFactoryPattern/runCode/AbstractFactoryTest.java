package ru.markush.creational.abstractFactoryPattern.runCode;

import ru.markush.creational.abstractFactoryPattern.factory.AnimalFactory;
import ru.markush.creational.abstractFactoryPattern.factory.CatFactory;
import ru.markush.creational.abstractFactoryPattern.factory.DogFactory;


public class AbstractFactoryTest {

    private static void createAnimalSay(AnimalFactory animalFactory){
        animalFactory.getAnimal().say();
    }

    public static void main(String[] args) {
        createAnimalSay(new DogFactory());
        createAnimalSay(new CatFactory());
    }
}
