package com.company.lesson8.professions;

public class Driver extends Person {
    private String experience;

    public Driver(String age, String fullName, String experience) {
        super(age, fullName);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
