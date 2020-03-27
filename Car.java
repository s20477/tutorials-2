package com.company;

public class Car
{

    String brand = brand;
    String color = color;
    int capacity = capacity;

    public Car (String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean isHighSpeed () {
        if (capacity >= 21) {
            return true;
        } else {
            return false;
        }
    }
    }
}
