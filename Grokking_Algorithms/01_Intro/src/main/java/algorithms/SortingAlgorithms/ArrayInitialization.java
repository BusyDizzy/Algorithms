package main.java.algorithms.SortingAlgorithms;

import java.util.Random;

public class ArrayInitialization {

    Random rnd = new Random();
    Integer[] array;

    public ArrayInitialization(int arrayLength) {
        this.array = new Integer[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(arrayLength);
        }
    }

    public Integer[] getArray() {
        return array;
    }

}
