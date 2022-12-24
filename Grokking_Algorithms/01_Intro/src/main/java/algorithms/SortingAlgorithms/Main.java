package main.java.algorithms.SortingAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Integer ARRAY_TO_SORT_LENGTH = 1000;

    public static void main(String[] args) {

        /**
         *  Инициализация массива рандомными значениями от 0 до ARRAY_TO_SORT_LENGTH
         */

        ArrayInitialization arrayObject = new ArrayInitialization(ARRAY_TO_SORT_LENGTH);


        /**
         * Сортировка выбором
         */

        SelectionSort selectionSort = new SelectionSort();
        Long currentTime =  System.currentTimeMillis();

        Integer[] array = selectionSort.sort(arrayObject.getArray());

        Long timeAfterSort =  System.currentTimeMillis();

        System.out.println(Arrays.toString(array));
        System.out.printf("Сортировка методом %s %d элементов составила %d миллисекунды",selectionSort.getClass().getSimpleName() ,ARRAY_TO_SORT_LENGTH, timeAfterSort - currentTime);
        System.out.println();

        /**
         * Быстрая сортировка используя метод основанный на списках и на потоках,
         * Т.е.   return quicksort(less) + pivot + quicksort(greater)
         */

        Long currentTime2 =  System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();

        List<Integer> arrayAsList =  quickSort.quickSortListBased(Arrays.asList(arrayObject.getArray()));

        Long timeAfterSort2 =  System.currentTimeMillis();

        System.out.println(Arrays.toString(arrayAsList.toArray()));
        System.out.printf("Сортировка методом %s %d элементов составила %d миллисекунды",quickSort.getClass().getSimpleName() , ARRAY_TO_SORT_LENGTH, timeAfterSort2 - currentTime2);
        System.out.println();

        /**
         * Быстрая сортировка используя Массивы и перестановку левой и правой части
         * с рекурсией относительно среднего элемента (pivot)
         * В данном случае мы передаем нижний и верхний индексы, правой и левой части для сортировки
         */
        Long currentTime3 =  System.currentTimeMillis();

        Integer[] array2 = quickSort.quickSortArrayBased(arrayObject.getArray(), 0, arrayObject.getArray().length - 1 );

        Long timeAfterSort3 =  System.currentTimeMillis();

        System.out.println(Arrays.toString(array2));
        System.out.printf("Сортировка методом %s %d элементов составила %d миллисекунды",quickSort.getClass().getSimpleName() ,ARRAY_TO_SORT_LENGTH, timeAfterSort3 - currentTime3);
        System.out.println();

        Long currentTime4 =  System.currentTimeMillis();

        /**
         * Встроенная сортировка Java
         */

        Integer[] array3 = arrayObject.getArray();
        Arrays.sort(array3);
        Long timeAfterSort4 =  System.currentTimeMillis();

        System.out.println(Arrays.toString(array3));
        System.out.printf("Сортировка методом %s %d элементов составила %d миллисекунды",array3.getClass().getSimpleName() ,ARRAY_TO_SORT_LENGTH, timeAfterSort4 - currentTime4);

    }
}
