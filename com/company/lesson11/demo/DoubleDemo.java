package com.company.lesson11.demo;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 32.14;
        Double double2 = new Double("32.14");

        Double double3 = Double.valueOf("45.23");
        Double double4 = 3.14;
        double d = Double.parseDouble("5.4");


        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(d);
    }
}