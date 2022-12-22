package com.anton.algorithms.SumUp;

import com.anton.algorithms.SortingAlgorithms.ArrayInit;

import java.util.Arrays;

public class SumArrayElements {

    private static final Integer ARRAY_TO_SORT_LENGTH = 10;

    public static void main(String[] args) {

        ArrayInit newArrayObject = new ArrayInit(ARRAY_TO_SORT_LENGTH);

        System.out.println(sumUp(newArrayObject.getArray()));

    }

    /**
     * Рекурсивная функция для подсчета элементов в списке
     */
    public static int sumUp (int [] array){

        int [] arrayCopy = Arrays.copyOf(array, array.length);

        if (arrayCopy.length == 0){
            return 0;
        }
        else {

            return arrayCopy[0] + sumUp(Arrays.copyOfRange(arrayCopy,1, arrayCopy.length));
        }
    }
}
