package ru.markush.creational.abstractFactoryPattern.factory;

import java.io.IOException;

public interface ResourceFactory {
    WritableResource getResource() throws IOException;
}
