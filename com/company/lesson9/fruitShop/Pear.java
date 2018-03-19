package com.company.lesson9.fruitShop;

/**
 * Created by Student on 02.03.2018.
 */
public class Pear extends Fruit {

    public Pear(Double weight,String color) {
        super(weight,color);
    }


    public  Double price(Fruit o) {
        if (o.getWeight() < 5) {
            return 50.25;

        } else {
            return 100.25;

        }
    }
}