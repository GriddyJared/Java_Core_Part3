package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> allLists = Arrays.asList(list1,list2,list3);

        System.out.println("List before flatmap:"+allLists);

        List<Integer> newLists = allLists.stream().flatMap(n->n.stream())
                .toList();

        System.out.println("after flatmap:"+ newLists);


        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        numbersList.stream().distinct().forEach(System.out::println);
    }
}
