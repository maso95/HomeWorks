package com.company.lesson4;

public class Gerlianda {

    public static void main(String[] args) {
        int g = 45;
        State(g);
        blink(g);
        FirsLight(g);
        State(g);
        RuningLine(g);
        State(g);
    }

    static void blink(int g) {
        for (int i = 1; i <= 3; i++) {
            g = ~g;
            System.out.println("Мирцание  " + Integer.toBinaryString(g));
        }
    }

    static void RuningLine(int g) {
        for (int i = 1; i <= 32; i++) {
            g = g << 1;
            System.out.println("Бегущая строка " + Integer.toBinaryString(g));
        }
    }

    static void FirsLight(int g) {
        if ((g & 1) == 1) {
            System.out.println("Лампочка Включена");
        } else {
            System.out.println("Лампочка Выключена");
        }
    }

    static void State(int g) {
        System.out.println("Статус " + Integer.toBinaryString(g));
        return;
    }
}
