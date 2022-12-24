package main.java.algorithms.BinarySearch;


import main.java.algorithms.SortingAlgorithms.ArrayInitialization;

import java.util.Arrays;

public class BinarySearch {

    private static final Integer ARRAY_TO_SORT_LENGTH = 100;
    private static final Integer ITEM_TO_SEARCH = 17;
    public static void main(String[] args) {
        ArrayInitialization myList = new ArrayInitialization(ARRAY_TO_SORT_LENGTH);
        Arrays.sort(myList.getArray());

        System.out.println(binarySearch( myList.getArray(), ITEM_TO_SEARCH));
        System.out.println(recurrentBinarySearch(myList.getArray(), ITEM_TO_SEARCH, 0,ARRAY_TO_SORT_LENGTH-1));


    }

    public static int binarySearch(Integer[] list, int item) {
        if (isListEmpty(list)) {
            return -1;
        }

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guessEqualsItem(guess, item)) {
                return mid;
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if(guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static boolean isListEmpty(Integer[] myList) {
        int listSize = myList.length;
        if (listSize == 0) {
            return true;
        }
        return false;
    }

    public static boolean guessEqualsItem(int guess, int item) {
        if (guess != item) {
            return false;
        }
        return true;
    }

    public static boolean guessGreaterThanItem(int guess, int item) {
        if (guess < item) {
            return false;
        }
        return true;
    }

    public static boolean guessLessThanItem(int guess, int item) {
        if (guess > item) {
            return false;
        }
        return true;
    }

    public static int recurrentBinarySearch(Integer[] list, int item, int min, int max){

        if (min + 1 == max){
            return -1;
        }

        int mid = (min + max) / 2;

        if (list[mid] == item){
            return mid;
        }
        else if ( list[mid] > item ) {
            max = mid;
            return recurrentBinarySearch(list, item, min , max);
        }
        else {
            min = mid;
           return recurrentBinarySearch(list, item, min, max);
        }

    }
}
