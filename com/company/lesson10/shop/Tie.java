package com.company.lesson10.shop;

public class  Tie  extends Clothes implements MaleClothes {

    public Tie(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return " Tie: ";
    }

    @Override
    public void dressMale() {
        System.out.println("Tie: "+getSize()+" Cost: "+getCost()+" Color: "+getColor());;
    }
}
