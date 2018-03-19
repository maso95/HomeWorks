package com.company.lesson10.shop;

public abstract class Clothes {
     private ClothesSize size;
     private int cost;
    private String color;

    public Clothes(ClothesSize size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}