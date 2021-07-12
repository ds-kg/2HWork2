package com.company;

public class Mazda extends Cars{
    @Override
    public void setName(String Mazda200) {
        super.setName(Mazda200);
    }

    public Mazda(String name, int year, int volume) {
        super(name, year, volume);
    }

    @Override
    public void setYear(int year) {
        super.setYear(2003);
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(2);
    }
}
