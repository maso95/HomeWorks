package com.company.lesson8.animals;

public abstract class Animal {
    private String food,location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public abstract void makeNosie();

    public abstract void eat();

    public void sleep(){
        System.out.println("sleeping");
    }
}
