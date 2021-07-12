package com.company;

public class Cars implements Printable{
    public String name;
    public int year;
    public int volume;

    public Cars(String name, int year, int volume) {
        this.name = name;
        this.year = year;
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;

    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println(name + " " + year + " " + volume);
    }
}
