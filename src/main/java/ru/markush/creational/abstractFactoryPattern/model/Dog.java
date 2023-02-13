package ru.markush.creational.abstractFactoryPattern.model;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public Dog() {
    }

    @Override
    public void say() {
        System.out.println("WOW!");
    }
}
