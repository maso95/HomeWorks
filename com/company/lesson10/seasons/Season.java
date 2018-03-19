package com.company.lesson10.seasons;

public enum Season {
    WINTER(0),SPRING(16),SUMMER(30){
        public String getDescription(){
            return "Теплое время года";
        }
    },AUTUMN(18);

    private final int avrgTemp;

    public int getAvrgTemp() {
        return avrgTemp;
    }

    Season(int avrgTemp) {
        this.avrgTemp = avrgTemp;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}