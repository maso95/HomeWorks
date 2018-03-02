package com.company.lesson8.print;

/**
 * Created by Student on 02.03.2018.
 */
public class PrintableDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Дагон");
        Book b2 = new Book("Мгла");
        Magazine m1 =new Magazine("Volli");
        Magazine m2 = new Magazine("LoLoPop");

        Printable[]p = {b1,b2,m1,m2};
        for (Printable b:p) {
            b.print();
        }

    }
}
