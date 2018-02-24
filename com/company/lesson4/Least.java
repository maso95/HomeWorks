package com.company.lesson4;

import java.util.Scanner;

public class Least {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = findTheABC(sc);
        int b = findTheABC(sc);
        int c = findTheABC(sc);
        int x = findOut(a, b, c);
        System.out.println("Найменьшее абcoлютнoe число " + x);
    }

    static int findTheABC(Scanner sc) {
        System.out.println("Введите целое число");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            x = x < 0 ? -x : x;
            return x;
        } else {
            System.out.println("Вы ввели не целое число!!!");
        }
        return 0;
    }

    static int findOut(int a, int b, int c) {
        int y;
        y = a < b ? a : b;
        y = y < c ? y : c;
        return y;
    }
}

