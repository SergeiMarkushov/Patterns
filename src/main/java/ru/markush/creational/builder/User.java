package ru.markush.creational.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String address;
    private final String phone;
    private final int age;
    private final int weight;
    private final int height;


}
