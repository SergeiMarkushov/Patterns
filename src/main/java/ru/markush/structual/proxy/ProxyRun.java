package ru.markush.structual.proxy;

public class ProxyRun {
    public static void main(String[] args) {
        LongGetter getter = new LongGetter() {};

        LongGetter proxy = new LongGetterCached(getter);

        for (int i = 0; i < 5; i++) {
            System.out.println(getter.getLong(100));
        }
    }
}
