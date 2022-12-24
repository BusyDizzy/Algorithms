package main.java.algorithms.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public SelectionSort() {
    }

    public static int findSmallestElement(Integer[] array){
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

    public static Integer[] removeElement(Integer[] array, int smallestIndexElement){

        Integer[] newArray = new Integer[array.length-1];

        for (int i = 0, k=0; i < array.length; i++) {
            if (i != smallestIndexElement ){
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public Integer[] sort(Integer[] arrayToSort){
        Integer[] arrayCopy = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Integer[] arrayToReturn = new Integer[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            int smallestElementIndex = findSmallestElement(arrayCopy);
            arrayToReturn[i] = arrayCopy[smallestElementIndex];
            arrayCopy = removeElement(arrayCopy, smallestElementIndex);

        }

        return arrayToReturn;
    }
}

