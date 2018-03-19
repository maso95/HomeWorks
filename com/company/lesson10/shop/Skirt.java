package com.company.lesson10.shop;

public class Skirt extends Clothes implements FemaleClothes {

    public Skirt(ClothesSize size, int cost, String color) {
        super(size, cost, color);
        }

    @Override
    public String toString() {
        return " Skirt: ";
    }

    @Override
        public void dressFemale() {
        System.out.println("Skirt: "+getSize()+" Cost: "+getCost()+" Color: "+getColor());;
    }
}
