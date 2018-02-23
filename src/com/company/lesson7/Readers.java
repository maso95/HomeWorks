package com.company.lesson7;

public class Readers { public static void main(String[] args) {
    Library[] reader = new Library[4];
    reader[0] = new Library("Gordan Freeman", "Ph.D1", "TP-06b",
            "14.01.1987", "0997534213");
    reader[1] = new Library("Travis Rice", "SM.F1", "ES-09",
            "9.10.1982", "0948265393");
    reader[2] = new Library("Harrison Ford", "IJ.B1", "LASR",
            "13.07.1942", "0660103485");
    reader[3] = new Library("Wade Wilson", "4WBr", "WOE-09",
            "8.04.1983", "0986420484");
    Book example1 = new Book("Dagon", "Howard P.Lovecraft");
    Book example2 = new Book("The Shining","Stephen E.King");
    Book example3 = new Book("A Song of Ice and Fire","George R. R. Martin");
    Book example4 = new Book("The Lord of the Rings","John. R. R. Tolkien");

    reader[0].takeBook(4);
    reader[1].takeBook("Dagon","A Song of Ice and Fire");
    reader[2].takeBook(example4,example1);
    reader[3].returnBook(1);
    reader[0].returnBook("The Shinning");
    reader[3].returnBook(example2);
    reader[2].returnBook(example3);
}
}
