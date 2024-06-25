package org.example;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List<String> allLetters = people.values().stream()
                .flatMap(n->n.stream()).
                filter(letter -> letter.matches("[a-zA-Z]"))
                .toList();

        allLetters.stream().forEach(System.out::println);
    }
}
