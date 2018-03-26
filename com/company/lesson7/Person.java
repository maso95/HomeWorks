package com.company.lesson7;

public class Person {
    String fullName;
    int age;

    Person(String n, int a) {
        fullName = n;
        age = a;
    }

    Person() {
    }

    void talking() {
        System.out.println(fullName + " :talks");
    }

    void moving() {
        System.out.println(fullName + " :is move");
    }
}
