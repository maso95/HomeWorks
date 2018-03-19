package com.company.lesson10.shop;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes1 = {
                new Skirt(ClothesSize.XS, 500, "Yellow"),
                new Tie(ClothesSize.S, 800, "Stripped"),
                new Pants(ClothesSize.M, 1200, "Black"),
                new TShirt(ClothesSize.L, 650, "Blue")
        };

        Clothes[] clothes2 = {
                new Skirt(ClothesSize.XXS, 500, "Red-blak"),
                new Tie(ClothesSize.L, 800, "Red-silver"),
                new Pants(ClothesSize.XS, 1200, "Black"),
                new TShirt(ClothesSize.S, 650, "Red-wight")
        };


        System.out.println("Man Dress:");
        for (Clothes c : clothes1) {

            if (c instanceof MaleClothes) {
                ((MaleClothes) c).dressMale();
            }
        }
        System.out.println("Woman Dress: ");
        for (Clothes c : clothes2) {

            if (c instanceof FemaleClothes) {
                ((FemaleClothes) c).dressFemale();
            }
        }

    }
}