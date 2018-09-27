package grokking.algo.Chapter_1_Introduction_to_Algo;

import java.util.Arrays;

public class RecursiveSum {

    public int sum(int [] numbers) {
        int sumResult = 0;
        if(numbers.length == 1) {
            sumResult += numbers[0];
        } else {
            sumResult = numbers[0] + sum(Arrays.copyOfRange(numbers, 1, numbers.length));
        }
        return sumResult;
    }
}
