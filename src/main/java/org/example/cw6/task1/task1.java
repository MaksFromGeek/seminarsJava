package org.example.cw6.task1;
import java.util.*;
/**
 * 1) Дан массив чисел, посчитать процент уникальных чисел.
 * *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class task1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,1));
        Set<Integer> set = new HashSet<>(array);
        double pr= set.size()*100/array.size();
        System.out.println("pr = "+pr);
    }
}
