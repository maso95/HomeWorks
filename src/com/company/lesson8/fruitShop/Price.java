package com.company.lesson8.fruitShop;

/**
 * Created by Student on 02.03.2018.
 */
public class Price {
    public static void main(String[] args) {
        Apple a1 = new Apple(1.5,"red");
        Apple a2 = new Apple(0.5,"green");
        Pear p = new Pear(4.2,"yellow");
        Apricot apr = new Apricot(10.5,"orange");

        System.out.println("Full price: "+(a1.price(a1)+a2.price(a2)+p.price(p)+apr.price(apr)));
        System.out.println("Apple price: "+(a1.price(a1)+a2.price(a2)));
        System.out.println("Pear price: "+p.price(p));
        System.out.println("Apricot price: "+apr.price(apr) );






    }
}
