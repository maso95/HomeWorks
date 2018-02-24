package com.company.lesson3;


import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    charConver();
                    break;
                case 2:
                    byteConver();
                    break;
                case 3:
                    doubleConver();
                    break;
                case 4:
                    floatConver();
                    break;
                case 5:
                    intConver();
                    break;
                case 6:
                    longConver();
                    break;
                case 7:
                    shortConver();
                    break;
                default:
                    System.out.println("Error!!!");
            }
        }
    }

    static void charConver() {
        System.out.println("Char");
        byte b;
        b = '{';
        System.out.println("Byte=" + b);
        double d = 'Л';
        System.out.println("Double=" + d);
        float f = 'П';
        System.out.println("Float=" + f);
        int i = '#';
        System.out.println("Int=" + i);
        long l = '&';
        System.out.println("Long=" + l);
        short s = '$';
        System.out.println("Short=" + s);
    }

    static void byteConver() {
        System.out.println("Byte");
        byte b = 123;
        char c = (char) b;
        System.out.println("Char=" + c);
        double d = b;
        System.out.println("Double= " + d);
        float f = b;
        System.out.println("Float= " + f);
        int i = b;
        System.out.println("Int= " + i);
        long l = b;
        System.out.println("Long= " + l);
        short s = b;
        System.out.println("Short= " + s);
    }

    static void doubleConver() {
        System.out.println("Double");
        double d = 103.213;
        byte b = (byte) d;
        System.out.println("Byte=" + b);
        char c = (char) d;
        System.out.println("Char= " + c);
        float f = (float) d;
        System.out.println("Float=" + f);
        int i = (int) d;
        System.out.println("Int=" + i);
        long l = (long) d;
        System.out.println("Long=" + l);
        short s = (short) d;
        System.out.println("Short=" + s);
    }

    static void floatConver() {
        System.out.println("Float");
        float f = 23.13f;
        byte b = (byte) f;
        System.out.println("Byte=" + b);
        char c = (char) f;
        System.out.println("Char= " + c);
        double d = f;
        System.out.println("Double=" + d);
        int i = (int) f;
        System.out.println("Int=" + i);
        long l = (long) f;
        System.out.println("Long=" + l);
        short s = (short) f;
        System.out.println("Short=" + s);
    }

    static void intConver() {
        System.out.println("Int");
        int i = 123;
        byte b = (byte) i;
        System.out.println("Byte=" + b);
        char c = (char) i;
        System.out.println("Char=" + c);
        double d = i;
        System.out.println("Double=" + d);
        float f = i;
        System.out.println("Float=" + f);
        long l = i;
        System.out.println("Long=" + l);
        short s = (short) i;
        System.out.println("Short=" + s);
    }

    static void longConver() {
        System.out.println("Long");
        long l = 123;
        byte b = (byte) l;
        System.out.println("Byte=" + b);
        char c = (char) l;
        System.out.println("Char =" + c);
        double d = l;
        System.out.println("Double" + d);
        float f = l;
        System.out.println("Float=" + f);
        int i = (int) l;
        System.out.println("Int=" + i);
        short s = (short) l;
        System.out.println("Short=" + s);
    }

    static void shortConver() {
        System.out.println("Short");
        short s = 123;
        byte b = (byte) s;
        System.out.println("Byte=" + b);
        char c = (char) s;
        System.out.println("Char=" + c);
        double d = s;
        System.out.println("Double=" + d);
        float f = s;
        System.out.println("Float=" + f);
        int i = s;
        System.out.println("Int=" + i);
        long l = s;
        System.out.println("Long=" + l);
    }
}