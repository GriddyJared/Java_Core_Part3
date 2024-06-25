package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {

        Integer[] nums = Stream.generate(new Random()::nextInt)
                        .limit(10).filter(n -> n%2==0).toArray(Integer[]::new);


        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        List<String> newList = myList.stream().filter(x -> x.startsWith("s"))
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .toList();
    }
}
