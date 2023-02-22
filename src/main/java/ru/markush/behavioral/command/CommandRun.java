package ru.markush.behavioral.command;

import java.util.function.Consumer;

public class CommandRun {
    // передача параметра через функциональные интерфейсы
    static void foo(Consumer<Integer> consumer, int x) {
        consumer.accept(x);
    }
}
