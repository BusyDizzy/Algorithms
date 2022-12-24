package main.java.algorithms.SortingAlgorithms;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    /**
     * Быстрая сортировка используя списки
     */
    public List<Integer> quickSortListBased(List<Integer> list){

        if (list.size() < 2){
            return list;
        }
        else {

            Integer base = list.get(0);
            List<Integer> leftList = list.stream().skip(1).filter(i -> i < base).toList();
            List<Integer> rightList = list.stream().skip(1).filter(i -> i > base).toList();

            return Stream.of(
                            quickSortListBased(leftList).stream(),
                            Stream.of(base),
                            quickSortListBased(rightList).stream())
                            .flatMap(Function.identity())
                            .collect(Collectors.toList());
        }

    }

    /**
     * Быстрая сортировка Массив - метод перестановки правой и левой части с рекурсией
     */
    public Integer [] quickSortArrayBased(Integer[] array, int low, int high) {
        if (array.length == 0)
            return array;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return array;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSortArrayBased(array, low, j);

        if (high > i)
            quickSortArrayBased(array, i, high);

        return array;
    }




}
