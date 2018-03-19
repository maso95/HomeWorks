package com.company.lesson9.fruitShop;

/**
 * Created by Student on 02.03.2018.
 */
public abstract class Fruit {
    private Double weight;
    private String color;

    public Fruit(Double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public  final void printManufacturerInfo(){
        System.out.println("Made in Ukraine");
    }

    public  abstract Double price(Fruit o);
}
