package com.company.lesson8.flowerBouquet;

public class Tulip extends Flower {
    private String color, budQual;

    public Tulip(String madeIn, String dayLast, int cost, String color, String budQual) {
        super(madeIn, dayLast, cost);
        this.color = color;
        this.budQual = budQual;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBudQual() {
        return budQual;
    }

    public void setBudQual(String budQual) {
        this.budQual = budQual;
    }
}
