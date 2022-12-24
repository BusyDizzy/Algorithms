package main.java.algorithms.FindingMaximum;

import main.java.algorithms.SortingAlgorithms.ArrayInitialization;

import java.util.Arrays;

public class FindingMaximum {

    private static final Integer ARRAY_TO_SORT_LENGTH = 10;
    public Integer findMaximum(Integer[] array) {

        if (array.length == 2){
            return array[0] > array[1] ? array[0] : array[1];
        }

        int localMax = findMaximum(Arrays.copyOfRange(array,1, array.length));



        return localMax > array[0] ? localMax : array[0];

    }

        public static void main(String[] args) {

            ArrayInitialization newArrayObject = new ArrayInitialization(ARRAY_TO_SORT_LENGTH);

            FindingMaximum fmax = new FindingMaximum();

            System.out.println(fmax.findMaximum(newArrayObject.getArray()));

        }


}
