package ru.markush.creational.singleton;

public class SingletonRun {
    private static void foo() {
        Singleton.getInstance().printHello();
    }

    private static void foo2() {
        SingletonSaved.getInstance().printHello();
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(SingletonRun::foo).start();
        }

        System.out.println();
        System.out.println("Saved singleton");
        for (int i = 0; i < 10; i++) {
            new Thread(SingletonRun::foo2).start();
        }
    }
}
