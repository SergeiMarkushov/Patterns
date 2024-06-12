package org.example.creationalPatterns.AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        DeviceFactory ru = getFactory("RU");
        DeviceFactory en = getFactory("EN");
        ru.getMouse().dbClick();
        ru.getTouchpad().track(2,3);
        en.getMouse().dbClick();
        en.getTouchpad().track(2,3);

    }
    public static DeviceFactory getFactory(String lang) {
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw  new RuntimeException("wrong language");
        }
    }
}

interface Mouse {
    void click();
    void dbClick();
    void scroll(int direction);
}
interface Keyboard{
    void print();
    void println();
}

interface Touchpad {
    void track(int deltaX, int deltaY);
}

interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}

class RuMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("щелк");
    }

    @Override
    public void dbClick() {
        System.out.println("щелк щелк");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("скролл вверх");
        } else if (direction < 0) {
            System.out.println("скролл вниз");
        } else {
            System.out.println("не скроллим");
        }
    }
}

class RuKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("печатаю");
    }

    @Override
    public void println() {
        System.out.println("Печатаю и переношу строку");
    }
}

class RuTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
        System.out.println("Передвинулись на " + s + " пикселей");
    }
}

class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("click");
    }

    @Override
    public void dbClick() {
        System.out.println("click click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("scroll up");
        } else if (direction < 0) {
            System.out.println("scroll down");
        } else {
            System.out.println("not scroll");
        }
    }
}

class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("typing");
    }

    @Override
    public void println() {
        System.out.println("Typing and move line");
    }
}

class EnTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
        System.out.println("Move on  " + s + " pixels");
    }
}

class EnDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}

class RuDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}