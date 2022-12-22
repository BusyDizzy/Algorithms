package com.anton.algorithms.SortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public SelectionSort() {
    }

    public static int findSmallestElement(int[] array){
        int smallestElement = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]< smallestElement){
                smallestElement = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] removeElement(int [] array, int smallestIndexElement){

        int [] newArray = new int[array.length-1];

        for (int i = 0, k=0; i < array.length; i++) {
            if (i != smallestIndexElement ){
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public int[] sortArray(int [] arrayToSort){
        int [] arrayCopy = Arrays.copyOf(arrayToSort, arrayToSort.length);
        int [] arrayToReturn = new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            int smallestElementIndex = findSmallestElement(arrayCopy);
            arrayToReturn[i] = arrayCopy[smallestElementIndex];
            arrayCopy = removeElement(arrayCopy, smallestElementIndex);

        }

        return arrayToReturn;
    }
}
