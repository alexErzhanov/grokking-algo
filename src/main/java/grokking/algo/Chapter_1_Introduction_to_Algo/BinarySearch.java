package grokking.algo.Chapter_1_Introduction_to_Algo;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> {

    public int search(List<T> list, T elem) {
        int low = 0;
        int hight = low + list.size();
        while (low <= hight) {
            int mid = (low + hight) / 2;
            T gues = list.get(mid);
            if (gues.compareTo(elem) == 0) {
                return mid;
            }
            if (gues.compareTo(elem) > 0) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}
