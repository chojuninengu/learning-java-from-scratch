package com.test.first_java.main;

import com.test.first_java.test.HorsePower;

public class Car {
    private String make;
    private String model;
    private HorsePower horsePower;

    public Car(String make, String model, HorsePower horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HorsePower getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(HorsePower horsePower) {
        this.horsePower = horsePower;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Horse Power: " + horsePower.getHorsePower());
    }
}   