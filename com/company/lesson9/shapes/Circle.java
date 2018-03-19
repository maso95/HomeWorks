package com.company.lesson9.shapes;

/**
 * Created by Student on 26.02.2018.
 */
public  class Circle extends Shape {
    private final double PI = 3.14;
    private double rad;

    public Circle(String color, double rad) {
        super(color);
        this.rad = rad;
    }

    public void square(){
        System.out.println("Площадь окружности: "+(PI*rad*rad));
    }

    public void leight(){
        System.out.println("Длина окружности: "+(2*PI*rad));
    }

    public double getPI() {
        return PI;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public void draw(String color) {

    }

    @Override
    public String toString() {
        return "Circle: " +
                "rad:" + rad ;
    }
}
