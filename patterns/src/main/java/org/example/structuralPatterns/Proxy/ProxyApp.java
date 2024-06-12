package main.java.org.example.structuralPatterns.Proxy;

public class ProxyApp {
    public static void main(String[] args) {
        Image image = new ProxyImage("D:/images/my.jpg");
        image.display();
    }
}

interface Image {
    void display();
}

class RealImage implements Image {
    private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    private void load() {
        System.out.println("Loading " + file);
    }

    @Override
    public void display() {
        System.out.println("Playing " + file);
    }
}

class ProxyImage implements Image {
    private String file;

    private RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();
    }
}