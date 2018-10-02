package grokking.algo.Chapter_1_Introduction_to_Algo;

import java.util.ArrayList;
import java.util.List;

public class QuickSort <T extends Comparable<T>>{

    public List<T> sort(List<T> elements) {
        List<T> res;
        if(elements.size() < 2) {
            return elements;
        } else {
            List<T> lessThan = new ArrayList<T>();
            List<T> greaterThan = new ArrayList<T>();
            T pointer = elements.get(Math.abs(elements.size() / 2));
            for (T elem: elements) {
                if(elem.compareTo(pointer) > 0){
                    greaterThan.add(elem);
                } else if (elem.compareTo(pointer) < 0){
                    lessThan.add(elem);
                }
            }

            res = new ArrayList<T>(sort(lessThan));
            res.add(pointer);
            res.addAll(sort(greaterThan));
        }
        return res;
    }
}
