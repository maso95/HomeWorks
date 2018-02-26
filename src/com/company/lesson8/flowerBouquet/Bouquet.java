package com.company.lesson8.flowerBouquet;

public class Bouquet {
    public static void main(String[] args) {
        Roses r1 = new Roses("UK", "16 days", 30, "red", "small");
        Roses r2 = new Roses("NL", "20 days", 35, "blue", "small");
        Roses r3 = new Roses("AT", "20 days", 25, "pink", "medium");
        Orchidaceae orch1 = new Orchidaceae("NL", "20 days", 25, "purple", "Ludisia");
        Orchidaceae orch2 = new Orchidaceae("UA", "20 days", 15, "yellow", "Cattleya");
        Tulip tul1 = new Tulip("UK", "35 days", 12, "orange", "high");
        Tulip tul2 = new Tulip("NL", "40 days", 14, "yellow", "high");

        Flower[] bouquet1 = {r1, r2, r2, orch1, orch1};
        Flower[] bouquet2 = {tul1, tul1, tul1, tul2, tul2, tul2};
        Flower[] bouquet3 = {r1, orch1, tul1, r2, orch2, tul2, r3, r3, r3};

        Flower.bouquetPrice(bouquet1);
        Flower.bouquetPrice(bouquet2);
        Flower.bouquetPrice(bouquet3);

        System.out.println("Партий цветов: "+Flower.getCount() );

        Flower.setCount(bouquet1.length + bouquet2.length + bouquet3.length);

        System.out.println("Продано цвето: " + Flower.getCount());
    }
}
