package com.company.lesson7;

import java.util.Arrays;

public class MatrixCore {
    int str, col;
    int[][] array = new int[str][col];


    MatrixCore(int[][]array) {
        this.array = array;
        this.str = array.length;
        this.col = array[0].length;
    }
    MatrixCore plus(MatrixCore m) {
        int[][] array =  new int[str][col];
        for (int i = 0; i < m.array.length; i++) {
            for (int j = 0; j < m.array.length; j++) {
                array[i][j] = this.array[i][j] + m.array[i][j];
            }
        }
        MatrixCore s = new MatrixCore(array);
        System.out.println(Arrays.deepToString(array));
        return s;
    }
    MatrixCore multiple(int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = array[i][j] * num;
            }
        }
        MatrixCore s = new MatrixCore(array);
        System.out.println(Arrays.deepToString(array));
        return s;
    }
}


