package com.company.lesson8.vehicles;

import com.company.lesson8.details.Engine;
import com.company.lesson8.professions.Driver;

public class SportCar extends Car {
    private String topSpeed;

    public SportCar(String brand, String carClass, double weight, Driver driver, Engine engine, String speed) {
        super(brand, carClass, weight, driver, engine);
        this.topSpeed = speed;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String speed) {
        this.topSpeed = speed;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Top Speed: " + topSpeed);
    }
}
