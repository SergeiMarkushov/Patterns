package ru.markush.structual.adapter;

public interface TvAction {

    void on();
    void off();
    void volumePlus();
    void volumeMinus();
    void nextChannel();
    void prevChannel();
    void channel(int channel);
}
