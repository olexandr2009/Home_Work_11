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
        if (numbers==null){
            return;
        }
        String e = Arrays.stream(numbers)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(s ->{
                    Integer.parseInt(s);
                    return s;
                })
                .sorted()
                .collect(Collectors.joining(", ","\"","\""));
        System.out.println(e);
    }
}
