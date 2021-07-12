package com.company;

public class Mers extends Cars {
    @Override
    public void setName(String Mers500) {
        super.setName(Mers500);
    }

    public Mers(String name, int year, int volume) {
        super(name, year, volume);
    }

    @Override
    public void setYear(int year) {
        super.setYear(2006);
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(5);
    }
}
