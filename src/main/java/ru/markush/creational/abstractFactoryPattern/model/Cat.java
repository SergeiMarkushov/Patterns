package ru.markush.creational.abstractFactoryPattern.model;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void say() {
        System.out.println("mew");
    }
}
