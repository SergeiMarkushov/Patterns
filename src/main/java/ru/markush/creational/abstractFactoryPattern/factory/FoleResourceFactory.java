package ru.markush.creational.abstractFactoryPattern.factory;

import java.io.IOException;

public class FoleResourceFactory implements ResourceFactory {
    private final String resource;


    public FoleResourceFactory(String resource) {
        this.resource = resource;
    }

    @Override
    public WritableResource getResource() throws IOException {
        return new FileResource(resource);
    }

}
