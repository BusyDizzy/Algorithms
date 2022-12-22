package com.anton.algorithms.SortingAlgorithms;

import java.util.Random;

public class ArrayInit {

    Random rnd = new Random();
    int [] array;

    public ArrayInit(int arrayLength) {
        this.array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(arrayLength);
        }
    }

    public int[] getArray() {
        return array;
    }

}
