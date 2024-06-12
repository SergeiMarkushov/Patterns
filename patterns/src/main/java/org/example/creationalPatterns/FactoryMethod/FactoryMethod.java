package main.java.org.example.creationalPatterns.FactoryMethod;

import java.util.Date;

public class FactoryMethod {
    public static void main(String[] args) {

        WatchMaker roman = getMakerByName("roman");
        roman.createWatch().showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equalsIgnoreCase("digital")) {
            return new DigitalWatchMaker();
        } else {
            return new RomanWatchMaker();
        }
    }
}

interface Watch {
    void showTime();
}
class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomanWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
class RomanWatchMaker implements WatchMaker{

    @Override
    public Watch createWatch() {
        return new RomanWatch();
    }
}