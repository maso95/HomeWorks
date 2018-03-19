package com.company.lesson9.shapes;


public class ShapeDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle("red",9);
        Circle c2 = new Circle("blue",13 );
        Rectcangle r = new Rectcangle("yellow",15,20);

        c1.square();
        c1.leight();
        c2.square();
        c2.leight();

        c1.equals(c2);
        System.out.println(c1.equals(c2));

        System.out.println(c1);
        System.out.println(r);
    }
}
