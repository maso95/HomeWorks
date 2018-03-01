package com.company.lesson5;

import java.util.Scanner;

public class LessThan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число ");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x > 0 && x < 10) {
                System.out.println("Число " + x + " положительное и меньше 10");
            } else {
                System.out.println("Число " + x + " положительное больше или равно 10 или отрицательное ");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
