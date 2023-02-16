package ru.markush.creational.prototype;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPrototype implements Cloneable{
    private final String name;
    private final String surname;
    private final String email;
    private final String address;
    private final String phone;
    private final int age;
    private final int weight;
    private final int height;

    @Override
    protected UserPrototype clone() throws CloneNotSupportedException {
        return (UserPrototype) super.clone();
    }
}
