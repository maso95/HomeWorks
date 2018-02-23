package com.company.lesson7;

public class Personality {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.fullName = "John Travolta";
        p1.age = 64;
        Person p2 = new Person("Samuel l. Jackson", 69);

        p1.talking();
        p2.talking();
        p1.moving();
        p2.talking();
        p2.moving();
    }
}
