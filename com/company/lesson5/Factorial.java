package com.company.lesson5;

public class Factorial {
    public static void main(String[] args) {
        int x = (int) ((Math.random()) * 5);
        int n = 1;
        for (int i = 1; i <= x; i++) {
            n *= i;
        }
        System.out.println(x + "!= " + n);
    }
}


