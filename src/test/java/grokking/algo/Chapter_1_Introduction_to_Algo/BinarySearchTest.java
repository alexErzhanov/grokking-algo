package grokking.algo.Chapter_1_Introduction_to_Algo;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    public void shouldFindElement() {
        //given
        BinarySearch<Integer> binarySearch = new BinarySearch<Integer>();
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);

        //when
        int searchResult = binarySearch.search(list, 4);

        //then
        assertEquals(2, searchResult);
    }
}