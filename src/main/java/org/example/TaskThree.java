package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskThree {
    public static final String[] numbers = new String[]{"1, 2, 0", "4, 5"};
    public static void main(String[] args) {
        printNumbers(numbers);
    }
    //Task3
    public static void printNumbers(String[] numbers){
        System.out.println(Arrays.stream(numbers)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}
