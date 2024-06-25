package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        stream.forEach(System.out::println);

        Stream.generate(new Random()::nextInt)
                .limit(3).forEach(System.out::println);

        List<Integer>  bagOfNumbers =  Stream.generate(new Random()::nextInt)
                                .limit(20).filter(n -> n%2==0).collect(Collectors.toList());

        System.out.println(bagOfNumbers);

    }
}