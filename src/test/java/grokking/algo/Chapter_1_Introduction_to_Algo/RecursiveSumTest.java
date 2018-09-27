package grokking.algo.Chapter_1_Introduction_to_Algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveSumTest {
    @Test
    public void shouldSumTwoNumbers() {
        //given
        RecursiveSum recursiveSum = new RecursiveSum();
        int [] numbers = {1, 4, 5, 6, 4};
        //when
        int sumResult = recursiveSum.sum(numbers);

        //then
        assertEquals(20, sumResult);
    }
}