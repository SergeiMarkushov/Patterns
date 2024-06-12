package main.java.org.example.structuralPatterns.Facade;


public class FacadePattern {
    public static void main(String[] args) {

//        Power power = new Power();
//        power.on();
//
//        DVDRom dvdRom = new DVDRom();
//        dvdRom.loadData();
//
//        HDD hdd = new HDD();
//        hdd.copyFormDVD(dvdRom);
        // создали facade = class Computer и перенесли все туда.

        Computer computer = new Computer();
        computer.copy();



    }
}
class Power {
    void on() {
        System.out.println("power on");
    }
    void off() {
        System.out.println("power off");
    }
}
class DVDRom {
    private boolean data = false;
    public boolean hasData() {
        return data;
    }
    void loadData() {
        this.data = true;
    }
    void unloadData() {
        this.data = false;
    }
}

class HDD {
    void copyFormDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("copy......");
        } else {
            System.out.println("Insert DVD");
        }
    }
}
class Computer { //Facade
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();
    void copy() {
        power.on();
        dvdRom.loadData();
        hdd.copyFormDVD(dvdRom);
    }
}