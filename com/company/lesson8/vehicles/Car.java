package com.company.lesson8.vehicles;

import com.company.lesson8.details.Engine;
import com.company.lesson8.professions.Driver;

public class Car {
    private String brand, carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево!");
    }

    public void turnRight() {
        System.out.println("Поворот направо!");
    }

    public void printInfo() {
        System.out.println("Driver: " + driver.getFullName() + ",Age: " + driver.getAge() + ",Exp: " + driver.getExperience());
        System.out.println("Car Class: " + carClass);
        System.out.println("Brand: " + brand);
        System.out.println("Engine: " + engine.getEngPow() + ", " + engine.getCompany());
        System.out.println("Weight: " + weight);
    }
}


