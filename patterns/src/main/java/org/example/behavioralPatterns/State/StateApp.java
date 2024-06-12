package main.java.org.example.behavioralPatterns.State;

public class StateApp {
    public static void main(String[] args) {
        Station station = new Radio7();
        Radio radio = new Radio();

        radio.setStation(station);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
            System.out.println("---------");
        }

    }
}

interface Station {
    void play();
}

class Radio7 implements Station {
    @Override
    public void play() {
        System.out.println("Radio 7 playing....");
    }
}

class RadioDFM implements Station {

    @Override
    public void play() {
        System.out.println("DFM paying....");
    }
}

class VestiFM implements Station {

    @Override
    public void play() {
        System.out.println("VestiFM paying....");
    }
}

class Radio {
    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        }
        else if (station instanceof RadioDFM) {
            setStation(new VestiFM());
        }
        else if (station instanceof VestiFM) {
            setStation(new Radio7());
        }
    }

    public void play() {
        station.play();
    }

}