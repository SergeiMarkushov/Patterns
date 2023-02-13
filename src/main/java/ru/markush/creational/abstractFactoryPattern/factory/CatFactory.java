package ru.markush.creational.abstractFactoryPattern.factory;


import ru.markush.creational.abstractFactoryPattern.model.Animal;
import ru.markush.creational.abstractFactoryPattern.model.Cat;

public class CatFactory extends AnimalFactory{


    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
