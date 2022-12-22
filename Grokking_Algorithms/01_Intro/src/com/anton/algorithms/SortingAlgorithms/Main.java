package com.anton.algorithms.SortingAlgorithms;

import java.util.Arrays;

public class Main {

    private static final Integer ARRAY_TO_SORT_LENGTH = 1000;

    public static void main(String[] args) {

        ArrayInit arrayObject = new ArrayInit(ARRAY_TO_SORT_LENGTH);
        Long currentTime =  System.currentTimeMillis();


        SelectionSort selectionSort = new SelectionSort();

        int []  array = selectionSort.sortArray(arrayObject.getArray());

        Long timeAfterSort =  System.currentTimeMillis();

        System.out.println(Arrays.toString(array));
        System.out.printf("Сортировка методом %s %d элементов составила %d миллисекунды",selectionSort.getClass().getSimpleName() ,ARRAY_TO_SORT_LENGTH, timeAfterSort - currentTime);


        ArrayInit arrayObject2 = new ArrayInit(5);
        Long currentTime2 =  System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();

        int [] array2 = quickSort.quickSort(arrayObject2.getArray());

        Long timeAfterSort2 =  System.currentTimeMillis();

        System.out.println(Arrays.toString(array2));
        System.out.printf("Сортировка методом %s %d элементов составила %d миллисекунды",quickSort.getClass().getSimpleName() ,ARRAY_TO_SORT_LENGTH, timeAfterSort2 - currentTime2);

    }
}
