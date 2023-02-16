package ru.markush.creational.singleton;

public class SingletonSaved {
    private static volatile SingletonSaved INSTANCE;

     private SingletonSaved(){
         System.out.println(this);
     }

    public static SingletonSaved getInstance() {
         if(INSTANCE == null) {
             synchronized (SingletonSaved.class) {
                 if (INSTANCE == null) {
                     INSTANCE = new SingletonSaved();
                 }
             }
         }
         return INSTANCE;
    }
    public void printHello() {
        System.out.println("Hello " + this);
    }

}
