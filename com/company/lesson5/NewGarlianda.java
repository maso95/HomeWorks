package com.company.lesson5;

import java.util.Scanner;

public class NewGarlianda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите число от 1 до 4 ");
        System.out.println("1 - Мерцание");
        System.out.println("2 - Проверить первую лампочку");
        System.out.println("3 - Бегущая строка");
        System.out.println("4 - Текущее Положение");
        int g = 45;
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    blink(g);
                    break;
                case 2:
                    firsLight(g);
                    break;
                case 3:
                    runningLine(g);
                    break;
                case 4:
                    state(g);
                    break;
                default:
                    System.out.println("Вы ввели неправельное число");
            }
        }
    }

    static void blink(int g) {
        for (int i = 0; i < 3; i++) {
            g = ~g;
            System.out.println("Мерцание " + Integer.toBinaryString(g));
        }
    }

    static void runningLine(int g) {
        for (int i = 0; i < 32; i++) {
            g = g << 1;
            System.out.println("Бегущая строка " + Integer.toBinaryString(g));
        }
    }

    static void firsLight(int g) {
        if ((g & 1) == 1) {
            System.out.println("Лампочка Включена");
        } else {
            System.out.println("Лампочка Выключена");
        }
    }

    static void state(int g) {
        System.out.println("Статус: " + Integer.toBinaryString(g));
    }
}
