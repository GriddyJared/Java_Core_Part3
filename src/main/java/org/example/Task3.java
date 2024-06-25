package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        List<String> filteredNames = memberNames.stream().filter(n -> n.length()>5 && n.startsWith("A"))
                .map(String::toLowerCase)
                .sorted()
                .toList();

        filteredNames.forEach(System.out::println);

       Boolean hasH= memberNames.stream().noneMatch(name ->name.contains("h"));

        System.out.println(hasH);

        long num = memberNames.stream().filter(n-> n.startsWith("A")).count();

        System.out.println(num);

        Optional startsWithL = memberNames.stream().filter(n -> n.startsWith("L")).findFirst();

        System.out.println(startsWithL.get());




    }
}
