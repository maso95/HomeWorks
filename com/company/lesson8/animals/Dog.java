package com.company.lesson8.animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public void makeNosie() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("Dog eating");
    }

    public void sleep() {
        super.sleep();
    }
}
