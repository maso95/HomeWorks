package com.company.lesson8.vehicles;

import com.company.lesson8.details.Engine;
import com.company.lesson8.professions.Driver;

public class Lorry extends Car {
    private String carrying;

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, String carrying) {
        super(brand, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public String getCarrying() {
        return carrying;
    }

    public void setCarrying(String carrying) {
        this.carrying = carrying;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Carrying: " + carrying);
    }
}
