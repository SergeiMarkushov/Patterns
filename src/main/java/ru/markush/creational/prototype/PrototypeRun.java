package ru.markush.creational.prototype;

public class PrototypeRun {
    public static void main(String[] args) throws CloneNotSupportedException {
        UserPrototype user = UserPrototype.builder()
                .name("Ivan")
                .surname("Ivanov")
                .age(45)
                .email("45@mail.ru")
                .phone("89776543211")
                .address("Street Nikova")
                .weight(60)
                .height(180)
                .build();
        System.out.println(user + " " + user.hashCode());
        UserPrototype clone = user.clone();
        System.out.println(clone + " " + clone.hashCode());
    }
}
