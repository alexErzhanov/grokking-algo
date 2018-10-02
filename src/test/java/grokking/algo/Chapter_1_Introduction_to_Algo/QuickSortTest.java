package grokking.algo.Chapter_1_Introduction_to_Algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    public void shouldSortElements() {
        //given
        QuickSort<Integer> quickSort = new QuickSort<Integer>();
        List<Integer> unsortedList = Arrays.asList(2, 8, 4, 1, 6);
        List<Integer> expectedList = Arrays.asList(1, 2, 4, 6, 8);

        //when
        List<Integer> sortResult = quickSort.sort(unsortedList);

        //then
        assertEquals(expectedList, sortResult);
    }

    @Test
    public void shouldReturnElementsIfSIzeLessThanTwo() {
        //given
        QuickSort<Integer> quickSort = new QuickSort<Integer>();
        List<Integer> unsortedList = Arrays.asList(2);

        //when
        List<Integer> sortResult = quickSort.sort(unsortedList);

        //then
        assertEquals(unsortedList, sortResult);
    }
}