package com.company.lesson9.fruitShop;

/**
 * Created by Student on 02.03.2018.
 */
public class Price {
    public static void main(String[] args) {
        Apple a1 = new Apple(1.5,"red");
        Pear p = new Pear(4.2,"yellow");
        Apricot apr = new Apricot(10.5,"orange");

        System.out.println("Fruit sell price "+(a1.price(a1)+p.price(p)+apr.price(apr)));
        System.out.println("Стоимость яблок: "+a1.price(a1));
        System.out.println("Стоимость груш: "+p.price(p));
        System.out.println("Стоимость абрикос: "+apr.price(apr));



    }
}
