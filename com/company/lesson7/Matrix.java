package com.company.lesson7;


public class Matrix {
    public static void main(String[] args) {
        MatrixCore m =new MatrixCore(new int[][]{{11,1,5},{4,9,2},{1,9,10}});
        m.plus(m);
        m.multiple(3);

        }
}

