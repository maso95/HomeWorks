package com.company.lesson10.musicShop;

import java.util.Objects;

public class Drum implements Instruments {
    String drumSize;

    public Drum(String drumSize) {
        this.drumSize = drumSize;
    }

    public String getDrumSize() {
        return drumSize;
    }

    public void setDrumSize(String drumSize) {
        this.drumSize = drumSize;
    }

    @Override
    public void play() {
        System.out.println("Play on a " + getDrumSize() + " drum ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Objects.equals(drumSize, drum.drumSize);
    }

    @Override
    public int hashCode() {

        return Objects.hash(drumSize);
    }

    @Override
    public String toString() {
        return "Drum: " +
                "drumSize: " + drumSize;
    }
}
