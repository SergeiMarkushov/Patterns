package ru.markush.creational.abstractFactoryPattern.factory;

import java.io.IOException;

public class Logger {

    private WritableResource resource;

    public Logger(ResourceFactory resourceFactory) throws IOException {
        resource = resourceFactory.getResource();
    }

    public void log (String message) {
        resource.write(message);
    }
}
