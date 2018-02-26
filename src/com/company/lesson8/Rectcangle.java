package com.company.lesson8;

/**
 * Created by Student on 26.02.2018.
 */
public abstract class Rectcangle extends Shape {
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
}
