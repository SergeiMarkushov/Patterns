package ru.markush.creational.abstractFactoryPattern.model;

public abstract class Animal {

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void say();
}
