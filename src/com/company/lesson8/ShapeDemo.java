package com.company.lesson8;



public class ShapeDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle("red",12);
        Circle c2 = new Circle("blue",10 );
        Rectcangle r = new Rectcangle("yellow",15,20);

        c1.equals(c2);
        System.out.println(c1.equals(c2));

        System.out.println(c1);
        System.out.println(r);
    }
}
