package ru.markush.creational.builder;

public class BuilderRun {

    public static void main(String[] args) {
        User user = User.builder()
                .name("Ivan")
                .surname("Ivanov")
                .age(45)
                .email("45@mail.ru")
                .phone("89776543211")
                .address("Street Nikova")
                .weight(60)
                .height(180)
                .build();

    }
}
