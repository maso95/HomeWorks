package com.company.lesson10.print;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printBook(Printable[] printables) {
        for (Printable print : printables) {
            if (print instanceof Book) {
                System.out.println("Book: " +print);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Печатаю книгу " + getName());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return getName() != null ? getName().equals(book.getName()) : book.getName() == null;

    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return  name;
    }
}
