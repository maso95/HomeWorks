package com.company.lesson8.animals;

public class Vet {
    public static void treatAnimal(Animal animal){
        System.out.println("Food: "+animal.getFood()+"; Location: "+animal.getLocation());
    }
}
