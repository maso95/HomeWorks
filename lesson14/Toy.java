package lesson14;

import java.util.Objects;

public class Toy {
    private String action, name;
    private int cost;
    private static int toyCount;

    public Toy(String action, String name, int cost) {
        this.action = action;
        this.name = name;
        this.cost = cost;
        toyCount++;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static int getToyCount() {
        return toyCount;
    }

    public static void setToyCount(int toyCount) {
        Toy.toyCount = toyCount;
    }

    public static void price(Toy[] toys) {
        int fullPrice = 0;
        for (Toy t : toys) {
            fullPrice += t.cost;
        }
        System.out.println("Full Price: " + fullPrice);
    }

    public void play() {
        System.out.println(getName() + ": " + getAction());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return cost == toy.cost &&
                Objects.equals(action, toy.action) &&
                Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, name, cost);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "action='" + action + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public static void main(String[] args) {
        Toy[] toys = {
                new Toy("To Infinity and Beyond", "Buzz Lightyear", 350),
                new Toy("You're my favorite deputy!", "Woody", 300),
                new Toy("Rooo-aaar", "Rex", 180)
        };

        Toy.price(toys);
        System.out.println();
        soldNumber();
        System.out.println();
        toyAction(toys);
    }

    private static void soldNumber() {
        System.out.println("Number of sold toys: " + toyCount);
    }

    private static void toyAction(Toy[] toys) {
        for (Toy t : toys) {
            t.play();
        }
    }
}
