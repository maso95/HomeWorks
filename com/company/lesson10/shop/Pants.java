package com.company.lesson10.shop;

public class Pants extends Clothes implements FemaleClothes,MaleClothes {

    public Pants(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return " Pants: ";
    }

    @Override
    public void  dressFemale() {
        System.out.println("Manly Pants: "+getSize()+" Cost: "+getCost()+"Color: "+getColor() );
    }

    @Override
    public void dressMale() {
        System.out.println("Tight Pants: "+getSize()+" Cost: "+getCost()+"Color: "+getColor());
    }
}
