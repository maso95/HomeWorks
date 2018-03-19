package com.company.lesson9.shapes;

/**
 * Created by Student on 26.02.2018.
 */
public  class Rectcangle extends Shape {
    private double s,d;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public Rectcangle(String color, double s, double d) {
        super(color);
        this.s = s;
        this.d = d;
    }

    @Override
    public void draw(String color) {

    }

    @Override
    public String toString() {
        return "Rectcangle: " +
                "s:" + s +
                ", d:" + d ;
    }
}
