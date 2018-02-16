package com.company.lesson4;

public class AverageOfThree {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x = (a + b + c) / 3;
        System.out.println("Среднее значение = " + x);
    }
}
