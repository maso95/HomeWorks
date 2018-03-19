package com.company.lesson10.print;

/**
 * Created by Student on 02.03.2018.
 */
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printMagazine(Printable[] printables) {
        for (Printable print : printables) {
            if (print instanceof Magazine) {
                System.out.println("Magazine: " + print);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Печатаю журнал " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;

        Magazine magazine = (Magazine) o;

        return getName() != null ? getName().equals(magazine.getName()) : magazine.getName() == null;

    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
