package main.java.org.example.creationalPatterns.Singleton;

public class SingletonApp {
    public static void main(String[] args) throws InterruptedException {
    }
}

class Singleton { //not for multithead

    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonMulti { // lazy synchronized but expensive
    private static SingletonMulti instance = null;

    private SingletonMulti () {
    }

    public static synchronized SingletonMulti getInstance() {
        if (instance == null) {
            instance = new SingletonMulti();
        }
        return instance;
    }
}

class SingletonMultiLazy { //lazy synchronized but not expensive
    private static volatile SingletonMultiLazy instance = null;

    private SingletonMultiLazy () {
    }

    public static SingletonMultiLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonMultiLazy.class) { // double check locking
                if (instance == null) {
                    instance = new SingletonMultiLazy();
                }
            }
        }
        return instance;
    }
}


class SingletonMultiLazyWithSyncObject { //lazy synchronized but not expensive

    private static final Object sync = new Object();
    private static volatile SingletonMultiLazyWithSyncObject instance = null;

    private SingletonMultiLazyWithSyncObject () {
    }

    public static SingletonMultiLazyWithSyncObject getInstance() {
        if (instance == null) {
            synchronized (sync) {
                if (instance == null) {
                    instance = new SingletonMultiLazyWithSyncObject();
                }
            }
        }
        return instance;
    }
}
