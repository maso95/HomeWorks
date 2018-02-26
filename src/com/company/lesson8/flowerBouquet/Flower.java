package com.company.lesson8.flowerBouquet;

public class Flower {
    private static int count;
    private String madeIn, dayLast;
    private int cost;

    public Flower(String madeIn, String dayLast, int cost) {
        this.madeIn = madeIn;
        this.dayLast = dayLast;
        this.cost = cost;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getDayLast() {
        return dayLast;
    }

    public void setDayLast(String dayLast) {
        this.dayLast = dayLast;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static void bouquetPrice(Flower[] b) {
        int price = 0;
        for (int i = 0; i < b.length; i++) {
            price += b[i].getCost();
        }
        System.out.println("BouquetPrice: " + price);
    }
}
