package com.company.lesson8.flowerBouquet;

public class Orchidaceae extends Flower {
    private String color, kinds;

    public Orchidaceae(String madeIn, String dayLast, int cost, String color, String kinds) {
        super(madeIn, dayLast, cost);
        this.color = color;
        this.kinds = kinds;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }
}
