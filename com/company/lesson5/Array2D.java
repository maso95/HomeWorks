package com.company.lesson5;

public class Array2D {
    public static void main(String[] args) {
        char a = 'a';
        String[][] twoD = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                twoD[i][j] = a + "" + (j + 1);
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
            a++;
        }
    }
}
