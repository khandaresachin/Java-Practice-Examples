package com.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExmaples {

    public static void main(String args[]) {
        // To calculate the square of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(10);
        numbers.add(8);

        List square = numbers
                .stream()
                .map(o -> o * o)   //  intermediate operation
                .collect(Collectors.toList());  // terminal operation

        System.out.println(square);

        List<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("CBA");
        strings.add("bac");
        strings.add("bba");
        strings.add("CCA");

        List upperCaseStrings = strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseStrings);

        List<String> books = new ArrayList<>();

        books.add("C Programming");
        books.add("Software Engineering");
        books.add("Spring and Spring Boot");
        books.add("Artificial Intelligence");
        books.add("Machine Learning");
        books.add("SQL");


        List booksStartsWithS =
                books.stream()
                        .filter(s -> s.startsWith("S"))
                        .collect(Collectors.toList());

        System.out.println(booksStartsWithS);

        Set<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(2);
        integers.add(9);
        integers.add(7);
        integers.add(4);
        integers.add(8);
        integers.add(5);

        Set numInt = integers.stream()
                .filter(integer -> integer < 5)
                .collect(Collectors.toSet());

        System.out.println(numInt);


        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(2);
        nums.add(6);
        nums.add(10);
        nums.add(8);

        nums.stream()
                .map(o -> o * o)   //  intermediate operation
                .forEach(integer -> System.out.println(integer));

        List<String> booksStr = new ArrayList<>();

        booksStr.add("C Programming");
        booksStr.add("Software Engineering");
        booksStr.add("Spring and Spring Boot");
        booksStr.add("Artificial Intelligence");
        booksStr.add("Machine Learning");
        booksStr.add("SQL");


        long count =
                books.stream()
                        .filter(s -> s.startsWith("S"))
                        .count();

        System.out.println("Number of books starting with 'S': " + count);


        List<String> strSample = new ArrayList<>();

        strSample.add("abc");
        strSample.add("CBA");
        strSample.add("bac");
        strSample.add("bba");
        strSample.add("CCA");

        List upperCaseStr = strSample.stream()
                .map(String :: toUpperCase)  // :: is method reference
                .collect(Collectors.toList());

        System.out.println(upperCaseStr);
    }
}
