package com.company.lesson5;

import java.util.Arrays;

public class Array5x8 {
    public static void main(String[] args) {
        int[][] ar2 = new int[5][2];
        int[][] ar1 = new int[][]{
                {9, 12, 1, 3, 11, 0, -12, -1},
                {-2, -46, 0, 12, -19, 8, 13, 2},
                {0, 0, 23, 93, -33, 63, 23, 16},
                {9, 14, 23, -3, 6, 0, 18, -1},
                {-56, 4, 32, 147, 32, 1, -2, 0}
        };
        System.out.println("Масив 5x8" + Arrays.deepToString(ar1));
        findNewArray(ar1, ar2);
        System.out.println("Масив 5x2" + Arrays.deepToString(ar2));
    }

    private static void findNewArray(int[][] ar1, int[][] ar2) {
        for (int i = 0; i < ar1.length; i++) {
            Arrays.sort(ar1[i]);
            ar2[i][0] = ar1[i][0];
            ar2[i][1] = ar1[i][7];
        }
    }
}