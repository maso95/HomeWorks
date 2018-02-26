package com.company.lesson8.flowerBouquet;

public class Roses extends Flower {
    private String color, thornSize;

    public Roses(String madeIn, String dayLast, int cost, String color, String thornSize) {
        super(madeIn, dayLast, cost);
        this.color = color;
        this.thornSize = thornSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThornSize() {
        return thornSize;
    }

    public void setThornSize(String thornSize) {
        this.thornSize = thornSize;
    }
}
