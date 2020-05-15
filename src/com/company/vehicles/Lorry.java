package com.company.vehicles;

public class Lorry extends Car {
    protected int carrying;

    public Lorry(String carModel, String classCar, int weightCar, int carrying) {
        super(carModel, classCar, weightCar);
        this.carrying = carrying;
    }

}
