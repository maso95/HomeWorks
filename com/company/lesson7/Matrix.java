package com.company.lesson7;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        MatrixCore m =new MatrixCore();
        MatrixCore m1 = new MatrixCore();
        MatrixCore m2 = new MatrixCore();
         m.mc = new int[3][3];
         m1.mc = new int[][]{{12, 2, 5}, {4, -1, 0}, {3, -15, 23}};
         m2.mc = new int[][]{{-11,0,-2},{0,6,6},{4,23,-14}};

         m.addition();


        }
}

