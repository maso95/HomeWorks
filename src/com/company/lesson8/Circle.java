package com.company.lesson8;

/**
 * Created by Student on 26.02.2018.
 */
public abstract class Circle extends Shape {
    private double rad;

    public Circle(String color, double rad) {
        super(color);
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
}