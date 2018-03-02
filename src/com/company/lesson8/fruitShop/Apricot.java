package com.company.lesson8.fruitShop;

/**
 * Created by Student on 02.03.2018.
 */
public class Apricot extends Fruit  {

    public Apricot(Double weight,String color) {
        super(weight,color);
    }

    @Override
    public Double price(Fruit o) {
        if(o.getWeight() < 5){
            return 45.25;

        }else {
            return 90.50;
        }
    }
}
