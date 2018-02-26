package com.company.lesson8;

public class PrintShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("красного", 15);
        shapes[1] = new Rectcangle("синего",15,30);
        for (Shape s:shapes) {
            s.draw();
        }
    }
}


