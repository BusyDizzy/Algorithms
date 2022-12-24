package main.java.algorithms.SumUp;

import main.java.algorithms.SortingAlgorithms.ArrayInitialization;

import java.util.Arrays;

public class SumArrayElements {

    private static final Integer ARRAY_TO_SORT_LENGTH = 10;

    public static void main(String[] args) {

        ArrayInitialization newArrayObject = new ArrayInitialization(ARRAY_TO_SORT_LENGTH);

        System.out.println(sumUp(newArrayObject.getArray()));

    }

    /**
     * Рекурсивная функция для подсчета элементов в списке
     */
    public static Integer sumUp (Integer[] array){

        Integer [] arrayCopy = Arrays.copyOf(array, array.length);

        if (arrayCopy.length == 0){
            return 0;
        }
        else {

            return arrayCopy[0] + sumUp(Arrays.copyOfRange(arrayCopy,1, arrayCopy.length));
        }
    }
}
