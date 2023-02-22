package ru.markush.behavioral.listener;

import java.util.Scanner;

public class ListenerRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventPool eventPool = new EventPool();
        eventPool.registerListener(System.out::println);
        eventPool.start();
        while (sc.hasNext()) {
            String s = sc.next();
            eventPool.publishEvent(new Event(s));
        }
    }
}
