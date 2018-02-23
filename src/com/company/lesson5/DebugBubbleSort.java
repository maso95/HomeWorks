package com.company.lesson5;

import java.util.Arrays;

public class DebugBubbleSort {
    public static void main(String[] args) {
        int[] rng = new int[]{3, 2, 0, 1, 5, 4, 6};
        bubbleSort(rng);
    }

    private static void bubbleSort(int[] rng) {
        for (int i = 0; i < rng.length; i++) {
            boolean flag = false;
            for (int j = 1; j < rng.length - i; j++) {
                if (rng[j - 1] < rng[j]) {
                    int nl = rng[j - 1];
                    rng[j - 1] = rng[j];
                    rng[j] = nl;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    }
}



