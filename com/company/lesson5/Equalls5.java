package com.company.lesson5;

public class Equalls5 {
    public static void main(String[] args) {
        int i = 1;
        do {
            ++i;
            if (i % 5 == 0) {
                System.out.println(i);
            }
        } while (i <= 100);
    }
}
