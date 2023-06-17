package com.example.train;

public class Train {
    private String name;
    private int numberOfCars;
    private int numberOfSeatsPerCar;

    public Train(String name, int numberOfCars, int numberOfSeatsPerCar) {
        this.name = name;
        this.numberOfCars = numberOfCars;
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public void setNumberOfSeatsPerCar(int numberOfSeatsPerCar) {
        this.numberOfSeatsPerCar = numberOfSeatsPerCar;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public int getNumberOfSeatsPerCar() {
        return numberOfSeatsPerCar;
    }
}


