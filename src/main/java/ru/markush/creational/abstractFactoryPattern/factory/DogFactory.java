package ru.markush.creational.abstractFactoryPattern.factory;


import ru.markush.creational.abstractFactoryPattern.model.Animal;
import ru.markush.creational.abstractFactoryPattern.model.Dog;

public  class DogFactory extends AnimalFactory{


    @Override
    public Animal getAnimal() {
        return new Dog();
    }

}
