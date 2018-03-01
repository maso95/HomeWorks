package com.company.lesson8.animals;

public class Zoo {
    public static void main(String[] args) {
        Cat c = new Cat("Fish","UA","short-haired");
        Dog d = new Dog("Meat","UK","german shepherd" );
        Horse h = new Horse("Hay","USA","high");

        Animal[]zoo={c,d,h};

        for (Animal z:zoo){
            Vet.treatAnimal(z);
        }
    }
}
