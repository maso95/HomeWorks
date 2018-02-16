package com.company.lesson3;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = findNumber(sc);
        int y = findNumber(sc);
        int z = x + y;
        System.out.println("Сумма: " + z);
    }

    static int findNumber(Scanner sc) {
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            return i;
        } else
            System.out.println("Вы ввели не целое число");
        return 0;
    }
}