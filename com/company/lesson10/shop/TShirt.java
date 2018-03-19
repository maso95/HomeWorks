package com.company.lesson10.shop;

public class TShirt extends Clothes implements MaleClothes,FemaleClothes {

    public TShirt(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return " TShirt: ";
    }

    @Override
    public void dressFemale() {
        System.out.println ("Man Tshirt: " + getSize() + " Cost: " + getCost() + " Color: " + getColor());
    }

    @Override
    public void dressMale() {
        System.out.println("Women Tshirt: " + getSize()+" Cost: "+getCost()+" Color: "+getColor());;
    }
}
