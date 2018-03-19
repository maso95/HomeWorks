package com.company.lesson10.musicShop;

public class InstrumentsDemo {
    public static void main(String[] args) {
        Guitar g1 = new Guitar("6");
        Guitar g2 = new Guitar("7");
        Drum d1 = new Drum("BIG");
        Drum d2 = new Drum("SMALL");
        Trumpet t1 = new Trumpet(75);
        Trumpet t2 = new Trumpet(36);

        Instruments[] inst = {g1, t2, d1, t1, d2, g2};
        for (Instruments instruments : inst) {
            instruments.play();
        }
    }
}
