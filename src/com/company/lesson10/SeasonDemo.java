package com.company.lesson10;

/**
 * Created by Student on 05.03.2018.
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        print(season);
        print(Season.AUTUMN);
        System.out.println();

        print();
        System.out.println();

        Season myFavSeason = Season.valueOf("AUTUMN");
        System.out.println();
        System.out.println(myFavSeason);
    }

        public static  void print(Season season){
        switch (season){
            case WINTER:
                System.out.println("Люблю зиму");
                break;
            case SPRING:
                System.out.println("Люблю весну");
                break;
            case SUMMER:
                System.out.println("Люблю лето");
                break;
            case AUTUMN:
                System.out.println("Люблю осень");
                break;
        }
}

    public static void print(){
        Season[]values = Season.values();
        for (Season v:values) {
            System.out.print(v+" ");
        }
    }
}
