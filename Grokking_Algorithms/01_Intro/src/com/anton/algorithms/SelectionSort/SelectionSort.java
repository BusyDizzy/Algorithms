package com.anton.algorithms.SelectionSort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SelectionSort {

    public static void main(String[] args) {

        int [] array = new int[]{10, 5, 7, 9, 16, 34, 67, 9,234,324 ,56,3,6,78,245};

        Long currentTime =  System.currentTimeMillis();
        array = sortArray(array);
        Long timeAfterSort =  System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.printf("Время работы составило %d", timeAfterSort - currentTime);

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

    public static int[] sortArray(int [] arrayToSort){
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
