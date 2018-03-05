package com.company.lesson8.animals;

public class Cat extends Animal {
    private String woolLength;

    public Cat(String food, String location, String woolLength) {
        super(food, location);
        this.woolLength = woolLength;
    }

    public void makeNosie() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("Cat eating");
    }

    public void sleep() {
        super.sleep();
    }

}
