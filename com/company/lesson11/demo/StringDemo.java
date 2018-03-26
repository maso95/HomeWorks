package com.company.lesson11.demo;

public class StringDemo {
    public static void main(String[] args) {
        verString("i like JAVA!!!");
        verString("i hate JAVA");

        lastChar("almost&");
        lastChar("i like JAVA!!!");

        charFind("i like JAVA!!!");

        modiString("i like JAVA!!!");

        subString("i like JAVA!!!");

    }

    public static void verString(String str) {
        System.out.println(str);
        System.out.println("End with: " + str.endsWith("!!!"));
        System.out.println("Start with: " + str.startsWith("i like"));

    }

    public static void lastChar(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static void charFind(String str) {
        System.out.println(str.indexOf("JAVA"));
        System.out.println(str.lastIndexOf("JAVA"));
    }

    public static void modiString(String str) {
        System.out.println(str.replace("like", "hate"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

    public static void subString(String str) {
        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 11));
    }
}