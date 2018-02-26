package com.company.lesson8.professions;

public class Person {
    private String age, fullName;

    public Person(String age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

