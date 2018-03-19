package com.company.lesson8.animals;

public class Horse extends Animal {
    private String stamina;

    public Horse(String food, String location, String stamina) {
        super(food, location);
        this.stamina = stamina;
    }

    public void makeNosie() {
        System.out.println("Neigh");
    }

    public void eat() {
        System.out.println("Horse eating");
    }

    public void sleep() {
        super.sleep();
    }
}
