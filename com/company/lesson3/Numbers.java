package com.company.lesson3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if ((i % 2) == 0) {
                System.out.println("Четное число");
            } else {
                System.out.println("Нечетное число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}