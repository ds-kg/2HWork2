package com.company;

public class BMW extends Cars{
    @Override
    public void setName(String BMW750) {
        super.setName(BMW750);
    }

    public BMW(String name, int year, int volume) {
        super(name, year, volume);
    }

    @Override
    public void setYear(int year) {
        super.setYear(2005);
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(5);
    }
}

