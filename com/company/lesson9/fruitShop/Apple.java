package com.company.lesson9.fruitShop;

/**
 * Created by Student on 02.03.2018.
 */
public class Apple extends Fruit {

    public Apple(Double weight,String color) {
        super(weight,color);
    }

    @Override
    public Double price(Fruit o) {
        if(o.getWeight() < 5){
            return 60.30;
        }else {
            return 120.60;
        }
    }
}
