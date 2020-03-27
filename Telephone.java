package com.company;

public class Telephone {

    String brand = brand;
    int resolution = resolution;
    int number = number;

    public Telephone (String brand, int resolution, int number) {
        this.brand = brand;
        this.resolution = resolution;
        this.number = number;
    }
    public void message (String X,int Y) {
        System.out.println("Send "+ X +" to "+ Y);
    }

    public int getNumber() {
        return this.number;
    }


}
