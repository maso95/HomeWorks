package com.company.lesson8.vehicles;

import com.company.lesson8.details.Engine;
import com.company.lesson8.professions.Driver;

import java.util.Arrays;

public class TurnEngine {
    public static void main(String[] args) {
        Driver rm = new Driver("34", "Robert McKenzi", "10");
        Driver dj = new Driver("45", "Dave Jones", "29");
        Engine crv = new Engine("750 hp", "Corvette");
        Engine v8 = new Engine("170 hp", "Honda");
        SportCar s = new SportCar("Chevrolet", "SportCar", 1.8, rm, crv, "350mph");
        Lorry l = new Lorry("Hyundai", "Lorry", 4.5, dj, v8, "10 tons");

        s.printInfo();
        l.printInfo();
        l.turnRight();
        l.turnLeft();
        l.stop();
        l.start();
    }
}
