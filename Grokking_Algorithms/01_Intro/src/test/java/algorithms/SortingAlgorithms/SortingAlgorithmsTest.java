package test.java.algorithms.SortingAlgorithms;

import main.java.algorithms.SortingAlgorithms.ArrayInitialization;
import main.java.algorithms.SortingAlgorithms.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortingAlgorithmsTest {

    private static final Integer ARRAY_TO_SORT_LENGTH = 1000;

    @Test
    public void TestSelectionSort (){

        ArrayInitialization arrayInit = new ArrayInitialization(ARRAY_TO_SORT_LENGTH);

        SelectionSort selectionSort = new SelectionSort();

        Integer[] selectionSortedArray = selectionSort.sort(arrayInit.getArray());
        Integer [] expectedSortedArray = arrayInit.getArray();
        Arrays.sort(expectedSortedArray);

        Assert.assertArrayEquals(selectionSortedArray, expectedSortedArray );

    }

}
