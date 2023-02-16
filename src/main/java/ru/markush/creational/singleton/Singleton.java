package ru.markush.creational.singleton;

public class Singleton {
    private static Singleton INSTANCE;

     private Singleton(){
         System.out.println(this);
     }

    public static Singleton getInstance() {
         if(INSTANCE == null) {
             INSTANCE = new Singleton();
         }
         return INSTANCE;
    }
    public void printHello() {
        System.out.println("Hello " + this);
    }

}
